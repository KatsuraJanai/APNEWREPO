package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Message {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int messageID;
	@Column(name = "employee_id")
	private String employeeID;
	@Column(name = "complaint_id")
	private int complaintID;
	private String message;
	@Column(name = "date_of_message")
	private Timestamp dateOfMessage;
	
	
	public Message() {
		messageID = 0;
		employeeID = "";
		complaintID= 0;
		message = "";
		dateOfMessage = null;
	}


	public Message(int messageID, String employeeID ,int complaintID, String message, Timestamp dateOfMessage) {
		super();
		this.messageID = messageID;
		this.employeeID = employeeID;
		this.complaintID = complaintID;
		this.message = message;
		this.dateOfMessage = dateOfMessage;
	}

	
	public Message(String employeeID, int complaintID, String message, Timestamp dateOfMessage) {
		super();
		this.employeeID = employeeID;
		this.complaintID = complaintID;
		this.message = message;
		this.dateOfMessage = dateOfMessage;
	}

	

	public int getMessageID() {
		return messageID;
	}


	public void setMessageID(int messageID) {
		this.messageID = messageID;
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


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Timestamp getDateOfMessage() {
		return dateOfMessage;
	}


	public void setDateOfMessage(Timestamp dateOfMessage) {
		this.dateOfMessage = dateOfMessage;
	}
	
	
	
}
