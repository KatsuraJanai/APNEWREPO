package deserial;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import serial.Employee;

public class DeserializationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp2 = new Employee();
		
		
		try {
			FileInputStream fis = new FileInputStream(new File("obj.dat"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			emp2 = (Employee) ois.readObject();
			System.out.println(emp2);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
