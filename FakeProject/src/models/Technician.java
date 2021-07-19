package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technician extends Employee {

	
	@Id
	@Column(name = "technician_id")
	private int technicianID;
	private String status;
	
	
	
	public Technician() {
		super();
		this.technicianID = 0;
		this.status = "";
	}



	public Technician(int technicianID, String status) {
		super();
		this.technicianID = technicianID;
		this.status = status;
	}



	public int getTechnicianID() {
		return technicianID;
	}



	public void setTechnicianID(int technicianID) {
		this.technicianID = technicianID;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
}
