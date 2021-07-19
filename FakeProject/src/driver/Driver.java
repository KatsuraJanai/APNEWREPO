package driver;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import models.Complaint;
import models.Customer;

//import guilogin.LoginGUI;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new LoginGUI();
		
		Customer customer1 = new Customer(123,"John","morgan","shaun1","876-998-1234","badman avenue","chicken@gmail.com");
		//customer1.addCustomer();
		customer1.createComplaint(new Complaint(1,123,"Internet Speed", "I have very slow internet i'd like to upgrade to a better package", "New", Time.valueOf(LocalTime.now()), Date.valueOf(LocalDate.now())));
	}

}
