package factories;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Student;

public class SessionFactoryBuilder {

	private static SessionFactory factory;
	
	
	
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			//MUST HAVE addAnnotatedClass()
			//hibernate.cfg.xml does not need to be passed as a string to configure() since by default it checks it. .xml name is changed then it must be passed through configure()
			factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
			//factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	//<property name="hbm2ddl.auto">update</property>
	
	public static void closeSessionFactory() {
		if(factory != null) {
			factory.close();
		}
	}
	
}
