package driver;

import java.sql.SQLException;

import models.Student;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		//Student student2 = new Student();
		try {
			student.create("110", "BreadingtonIV");
			student.update("107", "DolphinBoy");
			//student.delete("123");
			//student2.readAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
