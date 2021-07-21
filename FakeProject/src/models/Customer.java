package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.swing.JOptionPane;

//import org.hibernate.Session;
//import org.hibernate.Transaction;

//import factory.SessionFactoryBuilder;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="customer_id")
	private String customerID;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "password")
	private String password;
	@Column(name = "phone_number")
	private String phoneNumber;
	//@Column(name = "address")
	private String address;
	//@Column(name = "email")
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
