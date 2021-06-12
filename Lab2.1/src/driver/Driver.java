package driver;

import domain.ContainersNeeded;
import domain.MyException;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Exercise 5
		ContainersNeeded cn = new ContainersNeeded();
		try {
			cn.Demonstrate();
		} catch(ArithmeticException ae) {
			System.err.println(ae.getMessage());
		}*/
		
		//MyException exception = new MyException();
		
		//Exercise 6
		ContainersNeeded cn = new ContainersNeeded();
		try {
			cn.Demonstrate();
		} catch (MyException e) {
			
			System.err.println(e.getMessage());
		}
		
	}

}
