package models;

import java.io.Serializable;

//import javax.persistence.Column;

public class Package implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String packageID;
	
	private String packageName;
	
	private String packageDescription;
	
	private float packagePrice;
	
	
	public Package() {
		packageID = "";
		packageDescription = "";
		packagePrice = 0;
	}


	public Package(String packageID,String packageName, String packageDescription, float packagePrice) {
		super();
		this.packageID = packageID;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packagePrice = packagePrice;
	}
	
	
	
	public Package(String packageName, String packageDescription, float packagePrice) {
		super();
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packagePrice = packagePrice;
	}


	public String getPackageID() {
		return packageID;
	}


	public void setPackageID(String packageID) {
		this.packageID = packageID;
	}
	

	public String getPackageName() {
		return packageName;
	}


	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}


	public String getPackageDescription() {
		return packageDescription;
	}


	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}


	public float getPackagePrice() {
		return packagePrice;
	}


	public void setPackagePrice(float packagePrice) {
		this.packagePrice = packagePrice;
	}
	
	
	
	
	
	
}
