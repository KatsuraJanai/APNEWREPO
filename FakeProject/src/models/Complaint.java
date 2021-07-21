package models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.Session;

import factory.SessionFactoryBuilder;


@Entity
public class Complaint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "complaint_id")
	private int complaintID;
	@Column(name = "customer_id")
	private String customerID;
	private String category;
	private String description;
	private String status;
	@Column(name = "time_generated")
	private Time timeGenerated;
	@Column(name = "date_created")
	private Date dateCreated;
	
	
	public Complaint() {
		complaintID = 0;
		customerID = "";
		category = "";
		description = "";
		status = "";
		timeGenerated = null;
		dateCreated = null;
	}
	
	
	
	public Complaint(int complaintID, String customerID, String category, String description, String status,
			Time timeGenerated, Date dateCreated) {
		super();
		this.complaintID = complaintID;
		this.customerID = customerID;
		this.category = category;
		this.description = description;
		this.status = status;
		this.timeGenerated = timeGenerated;
		this.dateCreated = dateCreated;
	}




	public Complaint(String customerID, String category, String description, String status, Time timeGenerated,
			Date dateCreated) {
		super();
		this.customerID = customerID;
		this.category = category;
		this.description = description;
		this.status = status;
		this.timeGenerated = timeGenerated;
		this.dateCreated = dateCreated;
	}



	public int getComplaintID() {
		return complaintID;
	}


	public void setComplaintID(int complaintID) {
		this.complaintID = complaintID;
	}


	public String getCustomerID() {
		return customerID;
	}


	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Time getTimeGenerated() {
		return timeGenerated;
	}


	public void setTimeGenerated(Time timeGenerated) {
		this.timeGenerated = timeGenerated;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	
	
	
	
}
