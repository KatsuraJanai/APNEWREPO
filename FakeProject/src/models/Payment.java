package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private int paymentID;
	@Column(name = "card_id")
	private int cardID;
	@Column(name="account_id")
	private int accountID;
	@Column(name="bill_id")
	private int billID;
	@Column(name="payment_date")
	private Date paymentDate;
	@Column(name="paid_amount")
	private float paidAmount;
	
	
	
	
	
	
	public Payment() {
		super();
		this.paymentID = 0;
		this.cardID = 0;
		this.accountID = 0;
		this.billID = 0;
		this.paymentDate = null;
		this.paidAmount = 0;
	}






	public Payment(int paymentID, int cardID, int accountID, int billID, Date paymentDate, float paidAmount) {
		super();
		this.paymentID = paymentID;
		this.cardID = cardID;
		this.accountID = accountID;
		this.billID = billID;
		this.paymentDate = paymentDate;
		this.paidAmount = paidAmount;
	}


	public Payment(int cardID, int accountID, int billID, Date paymentDate, float paidAmount) {
		super();
		this.cardID = cardID;
		this.accountID = accountID;
		this.billID = billID;
		this.paymentDate = paymentDate;
		this.paidAmount = paidAmount;
	}



	public int getPaymentID() {
		return paymentID;
	}






	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}






	public int getCardID() {
		return cardID;
	}






	public void setCardID(int cardID) {
		this.cardID = cardID;
	}






	public int getAccountID() {
		return accountID;
	}






	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}






	public int getBillID() {
		return billID;
	}






	public void setBillID(int billID) {
		this.billID = billID;
	}






	public Date getPaymentDate() {
		return paymentDate;
	}






	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}






	public float getPaidAmount() {
		return paidAmount;
	}






	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	
	
	
	
	
	
}
