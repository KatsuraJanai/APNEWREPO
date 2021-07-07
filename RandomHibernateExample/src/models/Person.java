package models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

	@Column(name ="firstname")
	private String firstName;
	private String lastName;
	private String favColor;
	
	
	public Person() {
		firstName = "";
		lastName = "";
		favColor = "";
	}


	public Person(String firstName, String lastName, String favColor) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.favColor = favColor;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFavColor() {
		return favColor;
	}


	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", favColor=" + favColor + "]";
	}
	
	
	
	
}
