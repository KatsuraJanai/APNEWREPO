package domain;

public class Bird extends Animal implements AnimalBehaviour {

	private int numberOfWings;
	
	
	public Bird() 
	{
		super();
		numberOfWings = 0;
	}
	
	
	
	
	
	//PRIMARY
	public Bird(int numberOfWings) {
		super();
		this.numberOfWings = numberOfWings;
	}


	
	public int getNumberOfWings() {
		return numberOfWings;
	}


	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}






	@Override
	public String move() {
		return "I spread my wings and FLY!!!!";
	}

	@Override
	public String makeNoise() {
		return "chirp chirp";
	}

	@Override
	public void eat(String food) {
		if((food == "worms") || (food == "seeds")) 
		{
			System.out.println("edible");
			return;
		}
		System.out.println("inedible");
		
	}
	
	
	
	
	
}
