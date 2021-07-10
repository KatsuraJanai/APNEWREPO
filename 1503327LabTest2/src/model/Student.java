//Name: Taahir Parkes
//ID: 1503327

package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import factory.SessionFactoryBuilder;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private String id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	
	
	public Student() {
		id = "";
		firstName = "";
		lastName = "";
	}
	
	public Student(String id) {
		this.id = id;
	}


	public Student(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public void addStudent() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(this);
			transaction.commit();
			JOptionPane.showMessageDialog(null, "Student added to database", "Success Window", JOptionPane.INFORMATION_MESSAGE);
		}catch(RuntimeException ex) {
			if(transaction != null) {
				JOptionPane.showMessageDialog(null, "Record not inserted", "Failure Window\n" + ex, JOptionPane.ERROR_MESSAGE);
				transaction.rollback();
			}
		}catch(Exception e) {
			if(transaction != null) {
				JOptionPane.showMessageDialog(null, "Record not inserted", "Failure Window\n" + e, JOptionPane.ERROR_MESSAGE);
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		
	}
	
	public static Student retrieve(String id) {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Student student = (Student )session.get(Student.class, id);
			transaction.commit();
			session.close();
			return student;
		} catch(NullPointerException ex) {
			if(transaction != null) {
				JOptionPane.showMessageDialog(null, "Failed to retrieve record", "Failure Window\n" + ex, JOptionPane.ERROR_MESSAGE);
				transaction.rollback();
			}
			return null;
		} catch(Exception e) {
			if(transaction != null) {
				JOptionPane.showMessageDialog(null, "Failed to retrieve record", "Failure Window\n" + e, JOptionPane.ERROR_MESSAGE);
				transaction.rollback();
			}
			return null;
		}
		
	}
	

}
