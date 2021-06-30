package driver;

import java.sql.*;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306";
		Connection con = null;
		
		try {
			//get the connection
			con = DriverManager.getConnection(url,"root","");
			
			//check if connection was made to xampp server
			if(con != null) {
				JOptionPane.showMessageDialog(null, "Connected To Server", "Connection Window", JOptionPane.INFORMATION_MESSAGE);
			}
			
			//create statement
			
			//execute sql query
			
			//process result set
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
