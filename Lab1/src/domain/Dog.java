package domain;

public class Dog extends Animal implements AnimalBehaviour {

	private String breed;
	
	
	
	public Dog() 
	{
		super();
		breed = "";
	}
	
	

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	

	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	@Override
	public String move() {		
		return "walk";
	}

	@Override
	public String makeNoise() {
		return "woof woof nigga";
	}

	@Override
	public void eat(String food) {
		if((food == "bones") || (food == "chicken")) 
		{
			System.out.println("edible");
			return;
		}
		System.out.println("inedible");
		
		
	}
	
	
	
	
}
