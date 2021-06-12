package driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import domain.Vehicle;

public class Driver {
	
	
	
	public static void printListElements(List<Vehicle> list) 
	{
		for(Vehicle vehicle : list) 
		{
			System.out.println(vehicle);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//BOTH WORKS
		/*ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		cars.add(new Vehicle("Honda","Civic","Red",2013, "4WD"));
		cars.add(new Vehicle("Toyota","Corolla","Blue",2011, "4WD"));
		cars.add(new Vehicle("Nissan","Skyline GTR","Black",2015, "4WD"));*/
		
		
		List<Vehicle> cars = new ArrayList<Vehicle>();
		cars.add(new Vehicle("Honda","Civic","Red",2013, "4WD"));
		cars.add(new Vehicle("Toyota","Corolla","Blue",2011, "4WD"));
		cars.add(new Vehicle("Nissan","Skyline GTR","Black",2015, "4WD"));
		
		
		for(Vehicle car : cars)
		{
			System.out.println(car);
		}
		
		
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		vehicles.add(new Vehicle("Ferrari","Spider F50","Red",2014, "4WD"));
		vehicles.add(new Vehicle("Lamboughini","Aventador","Blue",2012, "4WD"));
		vehicles.add(new Vehicle("Dodge","GT","Black",2015, "4WD"));
		
		printListElements(vehicles);
		
	}

}
