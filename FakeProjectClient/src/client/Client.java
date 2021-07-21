package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import models.Customer;

public class Client {

	private Socket socket;
	private ObjectInputStream objIs;
	private ObjectOutputStream objOs;
	private String action;
	
	
	public Client() {
		
		sendAction();
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
			objIs = new ObjectInputStream(socket.getInputStream());
			objOs = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*private void addCustomer() {
		try {
			String action = "Add Customer";
			objOs.writeObject(action);
			objOs.flush();
			//NB customer will come from text boxes
			Customer customer = new Customer("Mark","Michaels","makr234","989-444-1234", "badman avenue","mark@gmail.com");
			objOs.writeObject(customer);
			objOs.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	private void sendAction() {
		String action = "Customer Login";
		try {
			connectToServer();
			configureStreams();
			
			objOs.writeObject(action);
			objOs.flush();
			
			if(action.equals("Add Customer")) {
				addCustomerAction();
			} else if(action.equals("Customer Login")) {
				customerLoginAction();
			}
			
			receiveResponse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnections();
		}
		
	}
	
	
	
	private void receiveResponse() {
		try {
			String response = (String) objIs.readObject();
			System.out.println(response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
	
	//CUSTOMER SECTION
	private void addCustomerAction() throws IOException {
		Customer customer = new Customer("1207","yuki","teru","kin","984-111-1223", "654 Ford Road","yuki@gmail.com");
		objOs.writeObject(customer);
		objOs.flush();
	}
	
	private void customerLoginAction() throws IOException {
		Customer customer = new Customer("1207","kin");
		objOs.writeObject(customer);
		objOs.flush();
		
	}
	
	
	
	
}
