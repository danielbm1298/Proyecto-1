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
	JTextArea txtmensaje;
	JButton btnsumar;
	private Socket clie;
	
	
	public Cliente() {
		txtmensaje = new JTextArea();
		txtmensaje.setBounds(10,10,100,20);
		add(txtmensaje);
		
		btnsumar = new JButton();
		btnsumar.setText("sumar 1");
		btnsumar.setBounds(10,40, 150, 20);
		btnsumar.addActionListener(this);
		add(btnsumar);
		
		setLayout(null);
		setSize(400,400);
		setVisible(true);
//
	}


	public static void main(String[] args) {
		new Cliente();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnsumar) {
			try {
				clie= new Socket("localhost",2626);
				DataOutputStream flujo= new DataOutputStream(clie.getOutputStream());
				flujo.writeUTF("1");
				DataInputStream actualiz = new DataInputStream(clie.getInputStream());
				String sumanueva=actualiz.readUTF();
				txtmensaje.removeAll();
				txtmensaje.append(sumanueva);
				clie.close();
			}catch (Exception ex) {
					System.out.println("Error en la coneccion con el servidor");
				}
				
			}
	}
}
		



