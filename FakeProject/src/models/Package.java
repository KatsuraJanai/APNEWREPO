package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Package implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "package_id")
	private String packageID;
	@Column(name = "package_name")
	private String packageName;
	@Column(name = "package_description")
	private String packageDescription;
	@Column(name = "package_price")
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
