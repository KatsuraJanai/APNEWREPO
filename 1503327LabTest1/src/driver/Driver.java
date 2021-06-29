//Taahir Parkes
//1503327
//6/25/2021

package driver;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import domain.Staff;
import domain.Student;

public class Driver {
	
	private static final Logger logger = LogManager.getLogger(Student.class);
	
	public static void initializeStudentList() {
		ArrayList<Student> list = new ArrayList<>();
		Student student1 = new Student("1234","Mike", 24,"badman ave");
		Student student2 = new Student("1298","Mikel", 15,"yardie ave");
		Student student3 = new Student("12399","Michelle", 13,"star ave");
		Student student4 = new Student("1111","Mi", 28,"badppl ave");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		Student.writeStudentToFile(list);
		System.out.println("Student Information Successfully Recorded!!!");
	}
	
	public static void printStudentList(ArrayList<Student> list) {
		for(Student student : list) {
			System.out.println(student);
		}
	}
	
	
	public static void initializeStaffMembers() {
		ArrayList<Staff> list = new ArrayList<>();
		Staff member1 = new Staff("1234","Mike", 30,"badman ave");
		Staff member2 = new Staff("1298","Mikel", 31,"yardie ave");
		Staff member3 = new Staff("12399","Michelle", 33,"star ave");
		Staff member4 = new Staff("1111","Mi", 28,"badppl ave");
		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member4);
		Staff.writeStaffMemberToFile(list);
		System.out.println("Staff Member Information Successfully Recorded!!!");
	}
	
	public static void printStaffList(ArrayList<Staff> list) {
		for(Staff staff : list) {
			System.out.println(staff);
		}
	}
	
	
	public static void menu() {
		int choice;
		ArrayList<Student> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("1.) Add Students");
		System.out.println("2.) Add Staff");
		System.out.println("3.) View Students");
		System.out.println("4.) View Staff");
		System.out.println("5.) List all students below the age 16");
		choice = input.nextInt();
		if(choice == 1) {
			initializeStudentList();
			logger.info("Students were added to the student file");
		} else if(choice == 3) {
			list = Student.readStudentsFromFile();
			logger.info("The Students file was viewed");
			printStudentList(list);
		} else if(choice == 2) {
			initializeStaffMembers();
			logger.info("Staff members were added to the staff file");
		} else if (choice == 4) {
			printStaffList(Staff.readStaffMembersFromFile());
		} else if(choice == 5) {
			list = Student.getAllStudentsBelowAge();
			logger.info("Students below the age of 16 information was retrieved from file");
			printStudentList(list);
		} else {
			System.out.println("GoodBye, incorrect input was recorded");
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		
	}

}
