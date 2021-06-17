package domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class User implements Serializable {
	
	private String firstName;
	private String lastName;
	private int age;
	private Date signupDate;
	
	
	public User() {
		firstName = "";
		lastName = "";
		age = 0;
		signupDate = null;
	}


	public User(String firstName, String lastName, int age, Date signupDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.signupDate = signupDate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getSignupDate() {
		return signupDate;
	}


	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", signupDate=" + signupDate
				+ "]";
	}
	
	
	public static void WriteToFile(ArrayList<User> list) throws IOException {
		for(User person : list) 
		{
			FileOutputStream fos = new FileOutputStream(new File("file.dat"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person);
		}		
	}
	
	
	public static ArrayList<User> ReadFromFile() {
		ArrayList<User> list = new ArrayList<>();
		User user = new User();
		try {
		FileInputStream fis = new FileInputStream(new File("file.dat"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(true) {
			
			user = (User) ois.readObject();
			list.add(user);
		}
		} catch(FileNotFoundException fe) {
			System.err.println(fe.getMessage());
		} catch(IOException ioe) {
			System.err.println(ioe.getMessage());
			return list;
		} catch(ClassNotFoundException ce) {
			System.err.println(ce.getMessage());
		}
		return list; 
		
	}
	

}
