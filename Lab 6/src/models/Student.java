package models;

import java.sql.*;

import com.mysql.cj.protocol.x.StatementExecuteOk;
import com.sun.tools.jconsole.JConsoleContext.ConnectionState;

import factories.DBConnectorFactory;

public class Student {

	private Connection con;
	
	
	public Student() {
		con = DBConnectorFactory.getDatabaseConnection();
	}
	
	public void create(String id, String name) throws SQLException {
		Statement statement = con.createStatement();
		//ResultSet rs = statement.executeQuery("insert into student(id,name) values ('"+id+"', '"+name+"') ");
		int count = statement.executeUpdate("insert into students(id,name) values ('"+id+"', '"+name+"') ");
		
		System.out.println(count + " row/s were affected.");
		statement.close();
		//con.close();
		
	}
	
	public void readAll() throws SQLException {
		
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("Select * from students");
		
		while(rs.next()) {
			String userData = rs.getString(1) + " : " + rs.getString(2);
			System.out.println(userData);
		}
		
		statement.close();
		//con.close();
		
	}
	
	public void update(String id, String name) throws SQLException {
		String query = "Update students set name = '"+name+"' where id = '"+id+"' ";
		Statement statement = con.createStatement();
		int count = statement.executeUpdate(query);
		
		System.out.println(count + " row/s were affected.");
		statement.close();
		//con.close();
	}
	
	public void delete(String id) throws SQLException {
		String query = "Delete from students where id = '"+id+"' ";
		Statement statement = con.createStatement();
		int count = statement.executeUpdate(query);
		
		System.out.println(count + " row/s were affected.");
		//statement.close();
		
	}
	
}
