package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private int billID;
	@Column(name = "amount_due")
	private float amount_due;
	@Column(name = "due_date")
	private Date due_date;
	
	
	public Bill() {
		super();
		this.billID = 0;
		this.amount_due = 0;
		this.due_date = null;
	}


	public Bill(int billID, float amount_due, Date due_date) {
		super();
		this.billID = billID;
		this.amount_due = amount_due;
		this.due_date = due_date;
	}


	public int getBillID() {
		return billID;
	}


	public void setBillID(int billID) {
		this.billID = billID;
	}


	public float getAmount_due() {
		return amount_due;
	}


	public void setAmount_due(float amount_due) {
		this.amount_due = amount_due;
	}


	public Date getDue_date() {
		return due_date;
	}


	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	
	
	
	
	
	
	
	
	
	
	
}
