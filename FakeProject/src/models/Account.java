package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@Column(name = "account_id")
	private int accountID;
	@Column(name = "customer_id")
	private int customerID;
	@Column(name = "package_id")
	private int packageID;
	private String status;
	@Column(name = "total_amount_due")
	private float totalAmountDue;
	@Column(name = "previous_balance")
	private float previousBalance;
	@Column(name = "payment_due_date")
	private Date paymentDueDate;
	@Column(name = "last_payment_date")
	private Date lastPaymentDate;
	
	
	public Account() {
		super();
		this.accountID = 0;
		this.customerID = 0;
		this.packageID = 0;
		this.status = "";
		this.totalAmountDue = 0;
		this.previousBalance = 0;
		this.paymentDueDate = null;
		this.lastPaymentDate = null;
	}
	
	
	
	public Account(int accountID, int customerID, int packageID, String status, float totalAmountDue,
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
	
	
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getPackageID() {
		return packageID;
	}
	public void setPackageID(int packageID) {
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
