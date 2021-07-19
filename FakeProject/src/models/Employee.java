package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	private int employeeID;
	@Column(name = "role_id")
	private int roleID;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String password;
	@Column(name = "phone_number")
	private String phoneNumber;
	private String address;
	private String email;
	
	
	public Employee() {
		super();
		this.employeeID = 0;
		this.roleID = 0;
		this.firstName = "";
		this.lastName = "";
		this.password = "";
		this.phoneNumber = "";
		this.address = "";
		this.email = "";
	}


	public Employee(int employeeID, int roleID, String firstName, String lastName, String password, String phoneNumber,
			String address, String email) {
		super();
		this.employeeID = employeeID;
		this.roleID = roleID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public int getRoleID() {
		return roleID;
	}


	public void setRoleID(int roleID) {
		this.roleID = roleID;
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
	
	
	
	
	

}
