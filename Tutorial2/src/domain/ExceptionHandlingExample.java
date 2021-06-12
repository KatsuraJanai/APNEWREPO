package domain;

import java.util.Scanner;

public class ExceptionHandlingExample {

	/*part1
	public static double findQuotient() {
		double quotient = 0;
		int firstNumber, secondNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		firstNumber = input.nextInt();
		
		
		System.out.println("Enter the second number");
		secondNumber = input.nextInt();
		
		try {
			quotient = firstNumber/secondNumber;
		} catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		return quotient;
	}*/
	
	//Part 2
	public static double findQuotient() throws ArithmeticException {
		double quotient = 0;
		int firstNumber, secondNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		firstNumber = input.nextInt();
		
		
		System.out.println("Enter the second number");
		secondNumber = input.nextInt();
		
		quotient = firstNumber/secondNumber;
		
		
		return quotient;
	}
	
	//Part3
	public static double analyze() {
		double quotient;
		try {
			quotient = findQuotient();
		} catch(ArithmeticException ae) {
			throw ae;
		}
		return quotient;
	}
	
}
