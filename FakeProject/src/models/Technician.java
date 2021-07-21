package models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="technician_id")  
public class Technician extends Employee {

	
	private String status;
	
	
	
	public Technician() {
		super();
		this.status = "";
	}



	public Technician(String status) {
		super();
		this.status = status;
	}

	


	public Technician(String employeeID, int roleID, String firstName, String lastName, String password,
			String phoneNumber, String address, String email,String status) {
		super(employeeID, roleID, firstName, lastName, password, phoneNumber, address, email);
		// TODO Auto-generated constructor stub
		this.status = status;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
}
