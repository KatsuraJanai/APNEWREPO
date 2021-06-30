package factories;

import java.sql.*;

public class DBConnectorFactory {
	
	private static Connection con;
	
	public static Connection getDatabaseConnection() {
		if(con == null) {
			try {
				//Class.forName("com.mysql.jdbc.Driver"); UNNECESSARY
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datalab","root","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
	

}
