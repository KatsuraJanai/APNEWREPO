package models;

import java.io.Serializable;
import java.sql.Date;

//import javax.persistence.Column;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int accountID;
	
	private String customerID;
	
	private String packageID;
	private String status;
	
	private float totalAmountDue;
	
	private float previousBalance;
	
	private Date paymentDueDate;
	
	private Date lastPaymentDate;
	
	
	public Account() {
		super();
		this.accountID = 0;
		this.customerID = "";
		this.packageID = "";
		this.status = "";
		this.totalAmountDue = 0;
		this.previousBalance = 0;
		this.paymentDueDate = null;
		this.lastPaymentDate = null;
	}
	
	
	
	public Account(int accountID, String customerID, String packageID, String status, float totalAmountDue,
			float previousBalance, Date paymentDueDate, Date lastPaymentDate) {
		super();
		this.accountID = accountID;
		this.customerID = customerID;
		this.packageID = packageID;
		this.status = status;
		this.totalAmountDue = totalAmountDue;
		this.previousBalance = previousBalance;
		this.paymentDueDate = paymentDueDate;
		this.lastPaymentDate = lastPaymentDate;
	}
	
	
	
	
	public Account(String customerID, String packageID, String status, float totalAmountDue, float previousBalance,
			Date paymentDueDate, Date lastPaymentDate) {
		super();
		this.customerID = customerID;
		this.packageID = packageID;
		this.status = status;
		this.totalAmountDue = totalAmountDue;
		this.previousBalance = previousBalance;
		this.paymentDueDate = paymentDueDate;
		this.lastPaymentDate = lastPaymentDate;
	}



	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getPackageID() {
		return packageID;
	}
	public void setPackageID(String packageID) {
		this.packageID = packageID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getTotalAmountDue() {
		return totalAmountDue;
	}
	public void setTotalAmountDue(float totalAmountDue) {
		this.totalAmountDue = totalAmountDue;
	}
	public float getPreviousBalance() {
		return previousBalance;
	}
	public void setPreviousBalance(float previousBalance) {
		this.previousBalance = previousBalance;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}
	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}
	
	
	
	
	
	
	
	
}
