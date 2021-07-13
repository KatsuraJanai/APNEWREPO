package math;

import java.io.Serializable;

public class Calculation implements Serializable {

	private int number1;
	private int number2;
	private String operation;
	
	
	public Calculation() {
		number1 = 0;
		number2 = 1;
		operation = "+";
	}


	public Calculation(int number1, int number2, String operation) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.operation = operation;
	}


	public int getNumber1() {
		return number1;
	}


	public void setNumber1(int number1) {
		this.number1 = number1;
	}


	public int getNumber2() {
		return number2;
	}


	public void setNumber2(int number2) {
		this.number2 = number2;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	
}
