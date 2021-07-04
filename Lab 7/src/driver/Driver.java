package driver;

import java.util.List;

import models.Student;

public class Driver {
	
	public static void displayStudentList(List<Student> list) {
		for(Student student : list) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student  student1 = new Student("122","Mary", "lou", "Mary@gmail.com");
		//student1.create();
		
		/*Student student2  = new Student("121", "Dolphin-Man", "AKA Jim");
		student2.update();
		
		student2 = new Student("124", "Crab-Legs","AKA Perk", "hoephone@gmail.com");
		student2.create();*/
		
		//displayStudentList(Student.readAll());
		
		Student student3 = new Student("123");
		student3.delete();
		
	}

}
