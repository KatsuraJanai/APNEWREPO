package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeComplaint {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_complaint_id")
	private int employeeComplaintID;
	@Column(name = "employee_id")
	private String employeeID;
	@Column(name = "complaint_id")
	private int complaintID;
	
	
	public EmployeeComplaint() {
		super();
		employeeComplaintID = 0;
		employeeID = "";
		complaintID = 0;
	}
	
	
	public EmployeeComplaint(int employeeComplaintID, String employeeID, int complaintID) {
		super();
		this.employeeComplaintID = employeeComplaintID;
		this.employeeID = employeeID;
		this.complaintID = complaintID;
	}


	public EmployeeComplaint(String employeeID, int complaintID) {
		super();
		this.employeeID = employeeID;
		this.complaintID = complaintID;
	}


	public int getEmployeeComplaintID() {
		return employeeComplaintID;
	}


	public void setEmployeeComplaintID(int employeeComplaintID) {
		this.employeeComplaintID = employeeComplaintID;
	}


	public String getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}


	public int getComplaintID() {
		return complaintID;
	}


	public void setComplaintID(int complaintID) {
		this.complaintID = complaintID;
	}
	
	
	
	
	
	
	
	
}
