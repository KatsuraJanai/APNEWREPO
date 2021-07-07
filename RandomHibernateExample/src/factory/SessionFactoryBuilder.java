package factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Employee;
import models.Person;

public class SessionFactoryBuilder {

	private static SessionFactory factory;
	
	
	
	
	public static SessionFactory getSessionFactory() {
		
		
		if(factory == null) {
			factory = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Person.class).buildSessionFactory();
		}
		
		return factory;
		
	}
	
	
	public static void closeSessionFactory() {
		if(factory != null){
			factory.close();
		} 
				
	}
	
}
