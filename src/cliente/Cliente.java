package cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;

public class Cliente extends JFrame implements ActionListener{ 
	int PUERTO=2485;
	JTextArea txtmensaje;
	JButton btnsumar;
	private Socket clie;
	boolean turno=true;
	
	
	public Cliente() {
		txtmensaje = new JTextArea();
		txtmensaje.setBounds(10,10,500,20);
		add(txtmensaje);
		
		btnsumar = new JButton();
		btnsumar.setText("sumar 1");
		btnsumar.setBounds(10,40, 150, 20);
		btnsumar.addActionListener(this);
		add(btnsumar);
		
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		try {
			clie= new Socket("Localhost",PUERTO);
			while(turno==true) {
			System.out.println("RECIBIENDO");
			DataInputStream actualiz = new DataInputStream(clie.getInputStream());
			String sumanueva=actualiz.readUTF();
			txtmensaje.append(sumanueva);
			//turno=false;
		}
		}catch (Exception ex) {
			System.out.println("Error en la coneccion con el servidor");
		}
	}
		
	public static void main(String[] args) {
		new Cliente();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnsumar) {
			try {
				DataOutputStream flujo= new DataOutputStream(clie.getOutputStream());
				flujo.writeUTF("1");

				System.out.println("por aqui va");
				turno=true;

			}catch (Exception ex) {
					System.out.println("Error en la coneccion con el servidor");
				}
				
			}
	}
}
		



