package server;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.sql.*;

import javax.swing.JOptionPane;

import models.Student;

public class Server {

	private ServerSocket serverSocket;
	private Socket connectionSocket;
	private ObjectInputStream objIs;
	private ObjectOutputStream objOs;
	private static Connection dbConn = null;
	private Statement stmt;
	private ResultSet result = null;
	
	
	
	public Server() {
	this.createConnection();
	this.waitForRequests();
	}
	
	//Step 1 obtain port
	private void createConnection() {
		try {
			//Tries to create a server socket bound to port 8888
			serverSocket = new ServerSocket(8888);
		}catch(IOException ex) {
			//If the port is already bound then an IOException is thrown
			ex.printStackTrace();
		}
	}
	
	//step 2 configure output and input streams using Socket Object as argument
	private void configureStreams() {
		try {
			
			//Instantiate ObjectOuputStream with Socket object as argument.
			objOs = new ObjectOutputStream(connectionSocket.getOutputStream());
			//Instantiate  ObjectInputStream with Socket object as argument
			objIs = new ObjectInputStream(connectionSocket.getInputStream());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Step 3 Setup Connection to database.
	
	private static Connection getDatabaseConnection() {
		if(dbConn == null) {
			try {
				String url = "jdbc:mysql://localhost:3306/datalab";
				dbConn = DriverManager.getConnection(url,"root","");
				JOptionPane.showMessageDialog(null, "DB Connection Established", "CONNECTION STATUS", JOptionPane.INFORMATION_MESSAGE);
			} catch(SQLException ex) {
				JOptionPane.showMessageDialog(null, "Could not connect to database\n" + ex,"Connection Failure", JOptionPane.ERROR_MESSAGE );
			}
			
		}
		return dbConn;
	}
	
	
	//Step 4 Close Streams and Connections
	private void closeConnections() {
		try {
			objIs.close();
			objOs.close();
			connectionSocket.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
private void addStudentToFile(Student student) {
		
		String query = "insert into students(id, firstName, lastName, email) VALUES('"+student.getId()+"','"+student.getFirstName()+"', '"+student.getLastName()+"', '"+student.getEmail()+"' )";
		
		try {
			stmt = dbConn.createStatement();
			if(stmt.executeUpdate(query) == 1) {
				//Return true to client if successful
				objOs.writeObject(true);
			}else {
				objOs.writeObject(false);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
			
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	private Student findStudentByID(String id) {
		Student student = new Student();
		String query = "select * from students where id = '"+id+"'  ";
		try {
			stmt = dbConn.createStatement();
			result = stmt.executeQuery(query);
			if(result.next()) {
				student.setFirstName(result.getString(2));
				student.setLastName(result.getString(3));
				student.setEmail(result.getString(4));
			}
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
		
		return student;
		
	}
	
	
	private void waitForRequests() {
		String action = "";
		getDatabaseConnection();
		Student stuObj = new Student();
		try {
			while(true) {
				connectionSocket = serverSocket.accept();
				this.configureStreams();
				try {
					action = (String) objIs.readObject();
					
					if(action.equals("Add Student")){
						stuObj = (Student) objIs.readObject();
						addStudentToFile(stuObj);
						objOs.writeObject(true);
					} else if(action.equals("Find Student")) {
						String id = (String) objIs.readObject();
						
						stuObj = findStudentByID(id);
						objOs.writeObject(stuObj);
					}
				}catch(ClassNotFoundException ex) {
					ex.printStackTrace();
				}catch(ClassCastException ex) {
					ex.printStackTrace();
				}catch(IOException ex) {
					ex.printStackTrace();
				}
				this.closeConnections();
			}
		}catch(EOFException eof) {
			System.out.println("Client has terminated connection with server");
			eof.printStackTrace();
		}catch(ClassCastException ex) {
			ex.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
