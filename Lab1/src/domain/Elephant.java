package domain;

public class Elephant extends Animal implements AnimalBehaviour {

	private double trunkLength;
	
	
	public Elephant() 
	{
		super();
		trunkLength = 0;
	}
	
	public Elephant(double trunkLength) 
	{
		super();
		this.trunkLength = trunkLength;
	}
	
	
	
	public double getTrunkLength() {
		return trunkLength;
	}

	public void setTrunkLength(double trunkLength) {
		this.trunkLength = trunkLength;
	}

	@Override
	public String move() {
		return "I make big steps in life";
	}

	@Override
	public String makeNoise() {
		return "I make trumpet noises";
	}

	@Override
	public void eat(String food) {
		if((food == "leafs") || (food == "hay")) 
		{
			System.out.println("edible");
			return;
		}
		System.out.println("inedible");
		
	}
	
	
	
	
}
