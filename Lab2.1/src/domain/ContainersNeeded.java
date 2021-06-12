package domain;

import java.util.Scanner;

public class ContainersNeeded {

	
	
	
	//GET THE SIZE OF THE WHOLESALECONTAINER
	public int EnterSizeOfWholesaleContainer()
	{
		int size = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the Wholesale container ");
		size = input.nextInt();
		
		
		return size;
	}
	
	//GET SIZE OF RETAIL CONTAINER
	public int EnterSizeOfRetailContainer() 
	{
		int size = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the Retail container ");
		size = input.nextInt();
		
		
		return size;
	}
	
	/*CALCULATE THE NUMBER OF RETAIL CONTAINERS NEEDED
	public int CalculateRetailContainersNeeded(int wSize, int rSize) 
	{
		int containersNeeded = 0;
		containersNeeded = wSize/rSize;
		return containersNeeded;		
	}*/
	
	/*CALCULATE THE NUMBER OF RETAIL CONTAINERS NEEDED, EXERCISE 2
		public int CalculateRetailContainersNeeded(int wSize, int rSize) 
		{
			int containersNeeded = 0;
			try {
				containersNeeded = wSize/rSize;
			} catch(ArithmeticException ae) {
				System.err.println(ae.getMessage());
			}
			
			return containersNeeded;		
		}*/
	
	/*EXERCISE 3,IT WILL NOT RUN WHEN 0 IS ENTERED BECAUSE THE EXCEPTION IS NOT HANDLE ONLY THROWN
	public int CalculateRetailContainersNeeded(int wSize, int rSize) throws ArithmeticException 
	{
		int containersNeeded = 0;
		containersNeeded = wSize/rSize;
		return containersNeeded;		
	}*/
	
	/*
	public void Demonstrate() 
	{
		int wholesaleSize;
		int retailSize;
		int numberOfRetailContainersNeeded;
		char choice;
		Scanner input = new Scanner(System.in);
		while(true) 
		{
			wholesaleSize = EnterSizeOfWholesaleContainer();
			retailSize = EnterSizeOfRetailContainer();
			numberOfRetailContainersNeeded = CalculateRetailContainersNeeded(wholesaleSize,retailSize);
			
			System.out.println("The number of retail containers need are " + numberOfRetailContainersNeeded);
			
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("Would you like to perform another calculation? (Y/N)");
			//READS CHAR INPUT
			choice = input.next().charAt(0);
			//OR choice = (char) System.in.read();
			if((choice == 'n') || (choice == 'N')) 
			{
				System.out.println("GOODBYE");
				break;
			} else if ((choice == 'y') || (choice == 'Y')) {
				//CLEAR TERMINAL
			} else {
				System.out.println("Incorrect value entered: Goodbye");
				break;
			}
		}
		
	}*/
	
	//Exercise 4,The EXCEPTION WAS AGAIN THROWN BUT NOT HANDLED THEREFORE IF 0 IS ENTERED IT WILL STLL CRASH
	public void Demonstrate() throws MyException 
	{
		int wholesaleSize;
		int retailSize;
		int numberOfRetailContainersNeeded;
		char choice;
		Scanner input = new Scanner(System.in);
		while(true) 
		{
			wholesaleSize = EnterSizeOfWholesaleContainer();
			retailSize = EnterSizeOfRetailContainer();
			if(retailSize == 0) 
			{
				throw new MyException();
			}
			numberOfRetailContainersNeeded = CalculateRetailContainersNeeded(wholesaleSize,retailSize);
			
			
			System.out.println("The number of retail containers need are " + numberOfRetailContainersNeeded);
			
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("Would you like to perform another calculation? (Y/N)");
			//READS CHAR INPUT
			choice = input.next().charAt(0);
			//OR choice = (char) System.in.read();
			if((choice == 'n') || (choice == 'N')) 
			{
				System.out.println("GOODBYE");
				break;
			} else if ((choice == 'y') || (choice == 'Y')) {
				//CLEAR TERMINAL
			} else {
				System.out.println("Incorrect value entered: Goodbye");
				break;
			}
		}
		
	}
	
	
	
	public int CalculateRetailContainersNeeded(int wSize, int rSize) throws MyException
	{
		int containersNeeded = 0;
		//WORKS
		/*try {
			if(rSize == 0){
				throw new MyException();
			}
			containersNeeded = wSize/rSize;
		} catch(MyException me) {
			System.err.println(me.getMessage());
		}*/
		if(rSize == 0) {
			throw new MyException();
		}
		containersNeeded = wSize/rSize;
		
		return containersNeeded;		
	}
	
	
	
	
	
}
