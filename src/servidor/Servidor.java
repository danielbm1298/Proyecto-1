package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import cliente.ColaClientes;

public class Servidor implements Runnable{

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
			ColaClientes cola = new ColaClientes();
			ServerSocket serv = new ServerSocket(2626);
			
			Socket cli;
			
			int sumatoria=0; 
			//cola.enqueue(serv.accept());
			System.out.println("numero de clientes"+cola.len());

				System.out.println("iniciando");
	
			while(true) {
				
			cli = serv.accept();
			
			
			
			
			DataInputStream flujo= new DataInputStream(cli.getInputStream());
			String msg=flujo.readUTF();
			
			
			DataOutputStream actualiz= new DataOutputStream(cli.getOutputStream());
			
			actualiz.writeUTF(sumatoria+"");
			
			if(msg.equals("1")) {
				sumatoria= sumatoria+1;
				System.out.println("la sumatoria es"+sumatoria);

			}
			if (sumatoria==10) {
				serv.close();
				System.out.println("Coneccion cerrada");
			}
			
			
			cli.close();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}