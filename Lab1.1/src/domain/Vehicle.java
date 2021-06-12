package domain;

public class Vehicle {

	private String make;
	private String model;
	private String color;
	private int year;
	private String fourWD;
	
	
	public Vehicle() 
	{
		super();
		make = "";
		model = "";
		color = "";
		year = 0;
		fourWD = "";
	}


	public Vehicle(String make, String model, String color, int year, String fourWD) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.fourWD = fourWD;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getFourWD() {
		return fourWD;
	}


	public void setFourWD(String fourWD) {
		this.fourWD = fourWD;
	}


	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + ", fourWD="
				+ fourWD + "]";
	}
	
	
	
	
}
