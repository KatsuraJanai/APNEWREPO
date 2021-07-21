package models;

import java.io.Serializable;


public class Customer implements Serializable {

	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerID;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String phoneNumber;
	
	private String address;
	
	private String email;
	
	public Customer() {
		customerID = "";
		firstName = "";
		lastName = "";
		password = "";
		phoneNumber = "";
		address = "";
		email = "";
	}


	public Customer(String customerID, String firstName, String lastName, String password, String phoneNumber, String address,
			String email) {
		super();
		
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;	
	}

	
	
	

	public Customer(String firstName, String lastName, String password, String phoneNumber, String address,
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}

	
	
	public Customer(String customerID, String password) {
		super();
		this.customerID = customerID;
		this.password = password;
	}


	public String getCustomerID() {
		return customerID;
	}


	public void setCustomerID(String customerID) {
		this.customerID = customerID;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	/*public void addCustomer() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		
		session.save(this);
		transaction.commit();
		session.close();
		JOptionPane.showMessageDialog(null, "Customer added to database", "Success Window", JOptionPane.INFORMATION_MESSAGE);
		//NEED TO LOG THAT IN THE FUTURE
		
	}
	
	
	public void createComplaint(Complaint complaint) {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		
		session.save(complaint);
		trans.commit();
		session.close();
		JOptionPane.showMessageDialog(null, "Complaint was created", "Success Window", JOptionPane.INFORMATION_MESSAGE);
	}*/

	
	
}
