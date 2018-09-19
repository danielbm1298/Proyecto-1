package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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
			ServerSocket serv = new ServerSocket(4545);
			Socket cli;
			int sumatoria=0; 
			while(true) {
			cli = serv.accept();
			DataInputStream flujo= new DataInputStream(cli.getInputStream());
			String msg=flujo.readUTF();
			
			
			DataOutputStream actualiz= new DataOutputStream(cli.getOutputStream());
			
			actualiz.writeUTF(sumatoria+"");
			
			if(msg.equals("1")) {
				sumatoria= sumatoria+1;
				System.out.println(sumatoria);

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