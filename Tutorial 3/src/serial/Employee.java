package serial;

import java.io.Serializable;

import date.MyDate;

public class Employee implements Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private String trn;
	private String phoneNumber;
	private MyDate dob;
	
	
	
	public Employee() {
		name = "";
		address = "";
		trn = "";
		phoneNumber = "";
		dob = null;
	}
	
	
	
	
	public Employee(String name, String address, String trn, String phoneNumber, MyDate dob) {
		super();
		this.name = name;
		this.address = address;
		this.trn = trn;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getTrn() {
		return trn;
	}




	public void setTrn(String trn) {
		this.trn = trn;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public MyDate getDob() {
		return dob;
	}




	public void setDob(MyDate dob) {
		this.dob = dob;
	}




	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", trn=" + trn + ", phoneNumber=" + phoneNumber
				+ ", dob=" + dob + "]";
	}
	
	
	
	
	
	
}
