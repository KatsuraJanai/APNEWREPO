package models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="representative_id")
public class Representative extends Employee {


	private String status;
	
	
	
	
	
	public Representative() {
		super();
		
		this.status = "";
	}






	public Representative(String employeeID, int roleID, String firstName, String lastName, String password,
			String phoneNumber, String address, String email,String status) {
		super(employeeID, roleID, firstName, lastName, password, phoneNumber, address, email);
		// TODO Auto-generated constructor stub
		this.status = status;
	}

	




	public Representative(String status) {
		super();
		this.status = status;
	}



	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
