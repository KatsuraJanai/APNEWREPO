package domain;

public class Animal {

	private String name;
	private int numberOfLegs;
	private double height;
	private double weight;
	
	//DEFAULT
	public Animal() 
	{
		name = "";
		numberOfLegs = 0;
		height = 0;
		weight = 0;
	}

	//primary constructor
	public Animal(String name, int numberOfLegs, double height, double weight) {
		super();
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", numberOfLegs=" + numberOfLegs + ", height=" + height + ", weight=" + weight
				+ "]";
	}
	
	
	
	
}
