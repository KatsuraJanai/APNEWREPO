package factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Account;
import models.AccountCard;
import models.Bill;
import models.Card;
import models.CardType;
import models.Complaint;
import models.Customer;
import models.Employee;
import models.Message;
import models.Package;
import models.Payment;
import models.Representative;
import models.Role;
import models.Technician;


public class SessionFactoryBuilder {

	private static SessionFactory factory;
	
	
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory = new Configuration().configure().addAnnotatedClass(Account.class)
					.addAnnotatedClass(AccountCard.class).addAnnotatedClass(Bill.class).addAnnotatedClass(Card.class)
					.addAnnotatedClass(CardType.class).addAnnotatedClass(Customer.class).addAnnotatedClass(Complaint.class)
					.addAnnotatedClass(Employee.class).addAnnotatedClass(Message.class).addAnnotatedClass(Package.class)
					.addAnnotatedClass(Payment.class).addAnnotatedClass(Representative.class).addAnnotatedClass(Role.class)
					.addAnnotatedClass(Technician.class).buildSessionFactory();
		}
		
		return factory;
	}
	
	
	public static void closeSessionFactory() {
		if(factory !=null ) {
			factory.close();
		}
	}
	
}
