package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Representative {

	@Id
	@Column(name = "representative_id")
	private int repID;
	private String status;
	
	
	
	
	
	public Representative() {
		super();
		this.repID = 0;
		this.status = "";
	}





	public Representative(int repID, String status) {
		super();
		this.repID = repID;
		this.status = status;
	}





	public int getRepID() {
		return repID;
	}





	public void setRepID(int repID) {
		this.repID = repID;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
