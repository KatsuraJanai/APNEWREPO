package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Package {
	
	@Id
	@Column(name = "package_id")
	private int packageID;
	@Column(name = "package_description")
	private String packageDescription;
	@Column(name = "package_price")
	private float packagePrice;
	
	
	public Package() {
		packageID = 0;
		packageDescription = "";
		packagePrice = 0;
	}


	public Package(int packageID, String packageDescription, float packagePrice) {
		super();
		this.packageID = packageID;
		this.packageDescription = packageDescription;
		this.packagePrice = packagePrice;
	}


	public int getPackageID() {
		return packageID;
	}


	public void setPackageID(int packageID) {
		this.packageID = packageID;
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
