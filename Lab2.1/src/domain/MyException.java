package domain;

public class MyException extends Exception {
	private String message;
	
	public MyException() 
	{
		message = "Cannot divide by zero, New Exception here :)";
	}
	
	public MyException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() 
	{
		return message;
	}

}
