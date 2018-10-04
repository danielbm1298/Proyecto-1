package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import cliente.ColaClientes;
import matrix.Linked_List;

public class Servidor implements Runnable{
	int PUERTO=9666;
	boolean cliente1=true;
	boolean cliente2=false;
	String msg="";
	String msg2="";
	

	public Servidor() {
		Thread hilo= new Thread(this);
		hilo.start();
			
	}

	public static void main(String[] args) {
		new Servidor();
	
	}


	@Override
	public void run() {
		try {
			Linked_List<Socket> cola = new Linked_List();
			ServerSocket serv = new ServerSocket(PUERTO);
			ColaClientes prueba = new ColaClientes();
			prueba.enqueue("lo que sea");
			prueba.enqueue("asdgasd");
			prueba.enqueue("2asdf");
			Object printear= prueba.peek();
			System.out.println(printear);

			Socket cli = new Socket();
			
			int sumatoria=0; 
			//cola.append(cli = serv.accept());
			//System.out.println("numero de clientes"+cola.len());
			System.out.println("iniciando");
	
			while(true) {		
			cli = serv.accept();
			cola.append(cli);
			System.out.println(cola.getLenght());
			
			
			while (cola.getLenght()==2) {
			if (cliente1==true) {
				System.out.println("recibiendo del cliente1");
				DataInputStream flujo1= new DataInputStream(cola.getNode(0).getData().getInputStream());
				msg=flujo1.readUTF();
                                System.out.println(msg);
                                cliente1=false;
                                cliente2=true;
			}
			
                        if (cliente2==true){
				System.out.println("recibiendo del cliente2");
				DataInputStream flujo2= new DataInputStream(cola.getNode(1).getData().getInputStream());
                                msg2=flujo2.readUTF();
                                System.out.println(msg2);
                                cliente2=false;
                                cliente1=true;
                                
			}


			
			if (sumatoria==10) {
				cola.getNode(0).getData().close();
				cola.getNode(1).getData().close();
				serv.close();
				System.out.println("Coneccion cerrada");
			}
			if(msg != null && msg2 != null) {
				DataOutputStream actualiz1= new DataOutputStream(cola.getNode(0).getData().getOutputStream());
				actualiz1.writeUTF("A1,A2,B2,B1");
				System.out.println(cola.getLenght());
				DataOutputStream actualiz2= new DataOutputStream(cola.getNode(1).getData().getOutputStream());
				actualiz2.writeUTF(msg2);

				}
				//System.out.println("numero de clientes"+cola.len());
			
			//cli.close();
			}
                        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}