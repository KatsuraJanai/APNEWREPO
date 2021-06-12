package driver;

import domain.ExceptionHandlingExample;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double quotient;
		
		try {
			//Static methods has to be accessed by the class itself not an instance of the class
			quotient = ExceptionHandlingExample.analyze();
			System.out.println("The quotient is " + quotient);
		} catch(ArithmeticException ae) {
			System.err.println("Bro, why are you trying to divide by zero?");
		}
		
		
	}

}
