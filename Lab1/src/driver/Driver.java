package driver;

import domain.Bird;
import domain.Dog;
import domain.Elephant;

public class Driver {

	public static void main(String[] args) {
		
		String noise;
		String movement; 
		
		Bird tweety = new Bird(2);
		tweety.eat("worms");
		noise = tweety.makeNoise();
		movement = tweety.move();
		System.out.println(noise + "   " + movement);
		
		
		
		Elephant stewart = new Elephant(12.6);
		stewart.eat("cabbage");
		noise = stewart.move();
		movement = stewart.makeNoise();
		System.out.println(noise + "   " + movement);

		
		Dog dodge = new Dog("Bull Terrier Mastiff");
		dodge.eat("bones");
		noise = dodge.makeNoise();
		movement = dodge.move();
		System.out.println(noise + "   " + movement);

		
		
		
		
		
	}

}
