package server;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class MultiThreadServer {

	private ServerSocket serverSocket;
	private Socket socket;
	private static int clientCount;
	private ObjectInputStream objIs;
	private ObjectOutputStream objOs;
	
	public MultiThreadServer() {
		clientCount = 0;
		try {
			serverSocket = new ServerSocket(8000);
			JOptionPane.showMessageDialog(null, "The server started at " + Timestamp.valueOf(LocalDateTime.now()), "Server Status", JOptionPane.INFORMATION_MESSAGE);
			waitingForConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void waitingForConnection(){
		while(true) {
			try {
				socket = serverSocket.accept();
				JOptionPane.showMessageDialog(null, "The server started thread for client at " + Timestamp.valueOf(LocalDateTime.now()), "Server Thread Status", JOptionPane.INFORMATION_MESSAGE);
				
				ClientHandler clientHandler = new ClientHandler(socket);
				Thread thread = new Thread(clientHandler);
				thread.start();
				clientCount++;
				//closeConnections();
				//remember to add EOF exception so the server knows that a client has disconnected
			} catch(IOException e) {
				e.printStackTrace();
				
			}
		}
		
	}
	
	
	/*private void closeConnections() {
		try {
			objIs.close();
			objOs.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	
	
	public class ClientHandler implements Runnable{

		private Socket socket;
		private ObjectInputStream objIs;
		private ObjectOutputStream objOs;
		
		
		public ClientHandler(Socket socket) throws IOException {
			this.socket = socket;
			objIs = new ObjectInputStream(socket.getInputStream());
			objOs = new ObjectOutputStream(socket.getOutputStream());
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
		
		
		@Override
		public void run()  {
			// TODO Auto-generated method stub
		
			
				double radius;
				double area;
				try {
					radius = objIs.readDouble();
					area = radius * radius * 3.14;
					objOs.writeDouble(area);
					objOs.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					closeConnections();
				}
				//closeConnections();
			
		}
		
	}
	
	
}
