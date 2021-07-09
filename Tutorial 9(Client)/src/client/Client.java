package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import models.Student;

public class Client {

	private Socket connectionSocket;
	private ObjectOutputStream objOs;
	private ObjectInputStream objIs;
	private String action;
	
	
	public Client(){
		this.createConnection();
		this.configureStreams();
	}
	
	
	
	private void createConnection() {
		try {
			connectionSocket = new Socket("127.0.0.1",8888);
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
			//create input stream to receive data from server
			objIs = new ObjectInputStream(connectionSocket.getInputStream());
			//create output stream to send data to server
			objOs = new ObjectOutputStream(connectionSocket.getOutputStream());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void closeConnections() {
		try {
			objIs.close();
			objOs.close();
			connectionSocket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void sendAction(String action) {
		this.action = action;
		try {
			objOs.writeObject(action);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void sendStudent(Student stuObj) {
		try {
			objOs.writeObject(stuObj);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendStudentId(String studId) {
		try {
			objOs.writeObject(studId);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void receiveResponse() {
		try {
			if(action.equalsIgnoreCase("Add Student")) {
				Boolean flag = (Boolean) objIs.readObject();
				if(flag == true) {
					JOptionPane.showMessageDialog(null, "Record Added Successfully","Add Record Status",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			if(action.equalsIgnoreCase("Find Student")) {
				Student student = new Student();
				student = (Student) objIs.readObject();
				if(student == null) {
					JOptionPane.showMessageDialog(null, "Record could not be found", "Find Record Status", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		}catch(ClassCastException ex) {
			ex.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
