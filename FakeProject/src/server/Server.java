package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private Socket socket;
	private ServerSocket serverSocket;
	private ObjectInputStream objIs;
	private ObjectOutputStream objOs;
	
	
	
	
	public Server() {
		obtainPort();
	}
	
	
	private void obtainPort() {
		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void waitForConnection() {
		
	}
	

}
