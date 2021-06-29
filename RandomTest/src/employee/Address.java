package employee;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String streetAddress;
	private String parish;
	
	
	public Address() {
		streetAddress = "";
		parish = "";
	}


	public Address(String streetAddress, String parish) {
		super();
		this.streetAddress = streetAddress;
		this.parish = parish;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	public String getParish() {
		return parish;
	}


	public void setParish(String parish) {
		this.parish = parish;
	}


	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", parish=" + parish + "]";
	}
	
	

}
