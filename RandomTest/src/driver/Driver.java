package driver;

import java.util.Scanner;

import javax.swing.JOptionPane;

import employee.Employee;
import forms.Gui;

public class Driver {
	
	
	static void showMenu() {
		int choice;
		
		Employee emp;
		Scanner input = new Scanner(System.in);
		System.out.println("Select an option from the menu below\n");
		System.out.println("1.Insert Employee Record\n");
		System.out.println("2.Find Employee Record\n");
		System.out.println("3.Exit.\n");
		choice = input.nextInt();
		if(choice == 1) {
			new Gui();
		} else if(choice == 2) {
			String id = JOptionPane.showInputDialog(null,"Enter student ID","Student Search", JOptionPane.INFORMATION_MESSAGE);
			
			emp = Employee.readFromFile(id);
			System.out.println(emp);
		} else {
			return;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();
		
	}

}
