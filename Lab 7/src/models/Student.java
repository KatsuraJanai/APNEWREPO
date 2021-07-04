package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import factories.SessionFactoryBuilder;



@Entity
@Table(name = "students")
public class Student {

	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	public Student() {
		id = "";
		firstName = "";
		lastName = "";
		email = "";
	}
	
	
	public Student(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Student(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public Student(String id) {
		super();
		this.id = id;
	}

	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	public void create() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction =  session.beginTransaction();
		try {
			session.save(this);
			transaction.commit();
			session.close();
			JOptionPane.showMessageDialog(null, "Student added to database", "Success Window", JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception e) {
			transaction.rollback();
			System.err.println(e.getMessage());
		}
		
	}
	
	public void update() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Student stu = (Student )session.get(Student.class, this.id);
		stu.setFirstName(this.firstName);
		stu.setLastName(this.lastName);
		session.update(stu);
		transaction.commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Student> readAll(){
		List<Student> list = new ArrayList<>();
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		list = (List<Student>) session.createQuery("From Student").getResultList();
		transaction.commit();
		session.close();
		
		
		return list;
	}
	
	public void delete() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Student stu = (Student) session.get(Student.class, this.id);
		session.delete(stu);
		transaction.commit();
		session.close();
	}
	
}
