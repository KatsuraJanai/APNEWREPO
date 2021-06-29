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




public class Student extends Person implements Serializable {

	private String studentID;
	
	
	public Student() {
		super();
		studentID = "";
	}

	//might need to fix this
	public Student(String studentID,String name, int age, String address) {
		super(name,age,address);
		this.studentID = studentID;
	}


	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getAddress()=" + getAddress();
	}

	//might need to change arguement to accept a list rather than a object
	public static void writeStudentToFile(ArrayList<Student> list) {
		try {
		FileOutputStream fos = new FileOutputStream(new File("Student.dat"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(Student student : list) {
			oos.writeObject(student);
		}
		oos.close();
		fos.close();
		} catch(IOException ioe) {
			System.err.println(ioe.getMessage());
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static ArrayList<Student> readStudentsFromFile(){
		Student student = new Student();
		ArrayList<Student> list = new ArrayList<>();
		try {
		FileInputStream fis = new FileInputStream(new File("Student.dat"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(true) {
			student = (Student) ois.readObject();
			list.add(student);
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
	
	public static ArrayList<Student> getAllStudentsBelowAge(){
		Student student = new Student();
		ArrayList<Student> list = new ArrayList<>();
		try {
		FileInputStream fis = new FileInputStream(new File("Student.dat"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(true) {
			
			student = (Student) ois.readObject();
			if(student.getAge() < 16) {
				list.add(student);
			}
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
