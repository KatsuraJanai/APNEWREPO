//Taahir Parkes
//1503327
//6/25/2021

package domain;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Staff extends Person implements Serializable {
	
	private String staffID;
	
	public Staff() {
		super();
		staffID = "";
	}

	public Staff(String staffID) {
		super();
		this.staffID = staffID;
	}

	public Staff(String staffId,String name, int age, String address) {
		super(name, age, address);
		staffID = staffId;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	
	
	@Override
	public String toString() {
		return "Staff [staffID=" + staffID + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()="
				+ getAddress() + "]";
	}

	public static void writeStaffMemberToFile(ArrayList<Staff> list) {
		try {
		FileOutputStream fos = new FileOutputStream(new File("Staff.dat"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(Staff staffMember : list) {
			oos.writeObject(staffMember);
		}
		oos.close();
		fos.close();
		} catch(IOException ioe) {
			System.err.println(ioe.getMessage());
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static ArrayList<Staff> readStaffMembersFromFile(){
		Staff staffMember = new Staff();
		ArrayList<Staff> list = new ArrayList<>();
		try {
		FileInputStream fis = new FileInputStream(new File("Staff.dat"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(true) {
			staffMember = (Staff) ois.readObject();
			list.add(staffMember);
		}
		} catch(FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		} catch(ClassNotFoundException cnfe) {
			System.err.println(cnfe.getMessage());
		} catch(EOFException eofe) {
			return list;
		} catch(Exception e) {
			System.err.println(e.getMessage());
		} 
		
		
		
		
		
		
		return list;
	}
	

}
