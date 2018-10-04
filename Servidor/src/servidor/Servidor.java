package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import cliente.ColaClientes;
import matrix.Linked_List;
import matrix.ReconocerFigura;

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
        static Linked_List ultima_conex = new Linked_List();
        public Linked_List stringtoList(){
            String el1=Character.toString(msg.charAt(0))+Character.toString(msg.charAt(1));
            String el2=Character.toString(msg.charAt(3))+Character.toString(msg.charAt(4));
            Linked_List<String>  ultima_conex =new Linked_List();
            ultima_conex.append(el1);
            ultima_conex.append(el2);
            return ultima_conex;
            
        }
        public static void bloquearborde(Linked_List listaconex){
            Linked_List prueba = new Linked_List();
                Linked_List<String> listaA1A2= new Linked_List();
                listaA1A2.append("A1");
                listaA1A2.append("A2");
                Linked_List<String> listaA2A3= new Linked_List();
                listaA2A3.append("A2");
                listaA2A3.append("A3");
                Linked_List<String> listaA3A4= new Linked_List();
                listaA3A4.append("A3");
                listaA3A4.append("A4");
                Linked_List<String> listaA4B4= new Linked_List();
                listaA4B4.append("A4");
                listaA4B4.append("B4");
                Linked_List<String> listaB4C4= new Linked_List();
                listaB4C4.append("B4");
                listaB4C4.append("C4");
                Linked_List<String> listaC4D4= new Linked_List();
                listaC4D4.append("C4");
                listaC4D4.append("D4");
                Linked_List<String> listaD3D4= new Linked_List();
                listaD3D4.append("D3");
                listaD3D4.append("D4");
                Linked_List<String> listaD2D3= new Linked_List();
                listaD2D3.append("D2");
                listaD2D3.append("D3");
                Linked_List<String> listaD1D2= new Linked_List();
                listaD1D2.append("D1");
                listaD1D2.append("D2");
                Linked_List<String> listaA1B1= new Linked_List();
                listaA1B1.append("A1");
                listaA1B1.append("B1");
                Linked_List<String> listaB1C1= new Linked_List();
                listaB1C1.append("B1");
                listaB1C1.append("C1");
                Linked_List<String> listaC1D1= new Linked_List();
                listaC1D1.append("C1");
                listaC1D1.append("D1");
                
                
                if(prueba.isequal(ultima_conex, listaA1A2)){
                    listaconex.delete(listaconex, ultima_conex);
                    }
                
                else if(prueba.isequal(ultima_conex,listaA2A3)){
                    listaconex.delete(listaconex, ultima_conex);
                    }
                else if(prueba.isequal(ultima_conex, listaA3A4)){
                    listaconex.delete(listaconex, ultima_conex);
                    }
                else if(prueba.isequal(ultima_conex, listaA4B4)){
                    listaconex.delete(listaconex, ultima_conex);
                }else if(prueba.isequal(ultima_conex, listaB4C4)){
                    listaconex.delete(listaconex, ultima_conex);
                    }
                else if(prueba.isequal(ultima_conex, listaC4D4)){
                    listaconex.delete(listaconex, ultima_conex);
                    }else if(prueba.isequal(ultima_conex, listaD3D4)){
                    listaconex.delete(listaconex, ultima_conex);
                    }else if(prueba.isequal(ultima_conex, listaD2D3)){
                    listaconex.delete(listaconex, ultima_conex);
                    }else if(prueba.isequal(ultima_conex, listaD1D2)){
                    listaconex.delete(listaconex, ultima_conex);
                    }else if(prueba.isequal(ultima_conex, listaA1B1)){
                    listaconex.delete(listaconex, ultima_conex);
                    }else if(prueba.isequal(ultima_conex, listaB1C1)){
                    listaconex.delete(listaconex, ultima_conex);
                    }else if(prueba.isequal(ultima_conex, listaC1D1)){
                    listaconex.delete(listaconex, ultima_conex);
                    }
                return;
                    
                          
                       
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
                        Linked_List conexTotal = new Linked_List();
                        Linked_List conexFig = new Linked_List();
                        Linked_List var = new Linked_List();

                        ReconocerFigura reconocerFigura = new ReconocerFigura();
                        
                        conexTotal.append(ultima_conex);
                        if (var.contains(ultima_conex, conexFig)){
                        var.delete(ultima_conex, conexTotal);
                        }
                        var.concatenar(conexFig,reconocerFigura.conex_en_fig(reconocerFigura.buscar(conexTotal, ultima_conex)));
                        bloquearborde(conexTotal);

			
			

			
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