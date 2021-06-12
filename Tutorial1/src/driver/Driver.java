package driver;

import domain.Employee;
import domain.PartTimeEmployee;
import domain.Payable;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payable payable = new PartTimeEmployee("emp123","Patrick","(123)111-2345",6);
		double overtime;
		double salary;
		overtime = payable.calculateOverTime();
		System.out.println("The overtime pay is " + overtime);
		
		
		
		/*
		Employee employee =  payable;
		in order for this to work payable needs to be cast to employee
		*/
		
		Employee employee =  (Employee) payable;
		salary = employee.CalculatePay();
		
		System.out.println("Pay check " + salary);
		
		System.out.println(employee);
		System.out.println(payable);
		
		
		
	}

}
