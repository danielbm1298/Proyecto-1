package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import cliente.ColaClientes;
import matrix.Linked_List;

public class Servidor implements Runnable{
	int PUERTO=2485;
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
			System.out.println("ya hay 2 clientes");
			if (cliente1==true) {
				System.out.println("recibiendo del cliente1");
				DataInputStream flujo1= new DataInputStream(cola.getNode(0).getData().getInputStream());
				msg=flujo1.readUTF();

			}
			
			if (cliente2==true){
				System.out.println("recibiendo del cliente2");
				DataInputStream flujo2= new DataInputStream(cola.getNode(1).getData().getInputStream());
				String msg2=flujo2.readUTF();
			}

			
			

			
			if(msg.equals("1") | msg2.equals("1")) {
				sumatoria= sumatoria+1;
				System.out.println("la sumatoria es "+sumatoria);
				DataOutputStream actualiz1= new DataOutputStream(cola.getNode(0).getData().getOutputStream());
				actualiz1.writeUTF("la sumatoria desde el server es: "+sumatoria+"");
				System.out.println(cola.getLenght());
				DataOutputStream actualiz2= new DataOutputStream(cola.getNode(1).getData().getOutputStream());
				actualiz2.writeUTF(sumatoria+"");
				if (cliente1==true) {
					cliente2=true;
					cliente1=false;
				}else {
					cliente1=true;
					cliente2=false;
				}
				//System.out.println("numero de clientes"+cola.len());

			}
			if (sumatoria==10) {
				cola.getNode(0).getData().close();
				cola.getNode(1).getData().close();
				serv.close();
				System.out.println("Coneccion cerrada");
			}
			
			
			//cli.close();
			}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}