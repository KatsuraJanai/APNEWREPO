//Name: Taahir Parkes
//ID: 1503327

package factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;

public class SessionFactoryBuilder {
	
	
	
	private static SessionFactory factory;
	
	
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		}
		return factory;
	}
	
	public static void closeSessionFactory() {
		if(factory != null) {
			factory.close();
		}
	}

}
