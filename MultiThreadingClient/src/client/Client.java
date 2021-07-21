package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

public class Client {
	
	
	private Socket socket;
	private ObjectInputStream objIs;
	private ObjectOutputStream objOs;
	private JFrame frame;
	private JTextField radiusTxt;
	private JLabel radiusLbl;
	private JButton button;
	
	
	public Client() {
		//connectToServer();
		/*initializeComponents();
		bounds();
		addComponentsToWindow();
		setWindowProperties();
		registerListeners();*/
		generateRadius();
	}
	
	private void connectToServer() {
		try {
			socket = new Socket("127.0.0.1", 8000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void configureStreams() {
		try {
			objOs = new ObjectOutputStream(socket.getOutputStream());
			objIs = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	private void initializeComponents() {
		frame = new JFrame("Area Calculator");
		radiusLbl = new JLabel("radius ");
		radiusTxt = new JTextField(15);
		button = new JButton("Click");
	}
	
	private void bounds() {
		radiusLbl.setBounds(5, 20, 50, 40);
		radiusTxt.setBounds(70, 20, 90, 30);
		button.setBounds(40,70,70,30);
	}
	
	private void addComponentsToWindow() {
		frame.add(radiusLbl);
		frame.add(radiusTxt);
		frame.add(button);
		
	}
	
	private void setWindowProperties() 
	{
		frame.setLayout(null);
		frame.setSize(250,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	private void registerListeners() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double radius = Double.parseDouble(radiusTxt.getText());
				connectToServer();
				configureStreams();
				try {
					objOs.writeDouble(radius);
					objOs.flush();
					receiveResponse();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					closeConnections();
				}
			}
			
		});
	}
	
	private void generateRadius() {
		double radius = 2;
		connectToServer();
		configureStreams();
		try {
			objOs.writeDouble(radius);
			objOs.flush();
			receiveResponse();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			closeConnections();
		}
	}
	
	private void receiveResponse() {
		try {
			double area = objIs.readDouble();
			System.out.println(area);
			JOptionPane.showMessageDialog(null, "The area is " + area,"Result Windpw", JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void closeConnections() {
		try {
			objIs.close();
			objOs.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
