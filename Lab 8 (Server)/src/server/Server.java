package server;

import java.io.*;
import java.net.*;

import math.Calculation;

public class Server {

	private ServerSocket serverSocket;
	private Socket socket;
	private ObjectInputStream objIs;
	private ObjectOutputStream objOs;
	
	
	public Server() {
	
		this.obtainPort();
		this.waitForRequest();
		
	}
	
	
	private void obtainPort() {
		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void waitForRequest() {
		
		while(true) {
			try {
				System.out.println("Listening for a client");
				socket = serverSocket.accept();
				this.configureStreams();
				this.performCalculation();
			} catch (EOFException ex) {
				System.out.println("SEVER- Client has disconnected from the server");
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} catch(IOException ex) {
				ex.printStackTrace();
			}
			
		}
	}
	
	private void configureStreams() {
		try {
			objIs = new ObjectInputStream(socket.getInputStream());
			objOs = new ObjectOutputStream(socket.getOutputStream());
			//closeConnections();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	} 
		
	}
	
	private void closeConnections() {
		try {
			objIs.close();
			objOs.close();
			socket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void performCalculation() {
		Calculation calculation = new Calculation();
		String result;
		int something;
		try {
			calculation = (Calculation) objIs.readObject();
			if(calculation.getOperation().equals("+")) {
				something = calculation.getNumber1() + calculation.getNumber2();
				//System.out.println("SERVER " + something);
				result = String.valueOf(something);
				objOs.writeObject(result);
				//System.out.println("SERVER " + result + "was passed over the stream to the client");
			}
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			closeConnections();
		}
	}
	
}
