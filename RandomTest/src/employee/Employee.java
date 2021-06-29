package employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Employee implements Serializable {

	private String empID;
	private String name;
	private Address address;
	
	public Employee() {
		empID = "";
		name = "";
		address = new Address();
	}

	public Employee(String empID, String name, Address address) {
		super();
		this.empID = empID;
		this.name = name;
		this.address = address;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public static void writeToFile(ArrayList<Employee> list) {
		try {
		FileOutputStream fos = new FileOutputStream(new File("QPCEmployees.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Employee e : list) {
			oos.writeObject(e);
			JOptionPane.showMessageDialog(null, "Info Saved to file", "Success window", JOptionPane.INFORMATION_MESSAGE);
		}
		} catch(IOException ie) {
			System.err.println(ie.getMessage());
		} catch(Exception e) {
			System.err.println(e.getMessage());
		} 
	}
	
	public static Employee readFromFile(String Id) {
		Employee emp = new Employee();
		try {
		
		FileInputStream fis = new FileInputStream(new File("QPCEmployees.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(true) {
			emp = (Employee) ois.readObject();
			if(emp.empID.equals(Id)) {
				
				return emp;
			}
		}
		}catch(ClassNotFoundException cnfe) {
			System.err.println(cnfe.getMessage());
		}catch(IOException ioe) {
			System.err.println(ioe.getMessage());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	
	
}
