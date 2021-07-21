package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Server {

	
	private ServerSocket serverSocket;
	private Socket socket;
	
	
	
	
	public Server() {
		try {
			serverSocket = new ServerSocket(8000);
			JOptionPane.showMessageDialog(null, "Server Obtained port 8000", "Got port", JOptionPane.INFORMATION_MESSAGE);
			while(true) {
				socket = serverSocket.accept();
				JOptionPane.showMessageDialog(null, "A client has been accepted", "Accept Window", JOptionPane.INFORMATION_MESSAGE);
				ClientHandler miniServer = new ClientHandler(socket);
				Thread threadObj = new Thread(miniServer);
				threadObj.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
