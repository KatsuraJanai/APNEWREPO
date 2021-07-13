package driver;

import client.Client;
import models.Student;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client();
		Student student = new Student("1111","Johnny","Michlson","jon@gmail.com");
		
		client.sendAction("Add Student");
		System.out.println("Message sent to server");
		client.sendStudent(student);
		System.out.println("Record sent to server");
		client.receiveResponse();
		System.out.println("Response received from server");
		
		//client.sendAction("Find Student");
		//client.sendStudentId("121");
		//client.receiveResponse();
		client.closeConnections();
	}

}
