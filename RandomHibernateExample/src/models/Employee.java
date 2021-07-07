package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import factory.SessionFactoryBuilder;


@Entity
@Table(name = "employee")
public class Employee extends Person {
	@Id
	@Column(name = "emp_id")
	private String empID;
	
	
	
	
	

	public Employee() {
		super();
		empID = "";
	}

	public Employee(String firstName, String lastName, String favColor, String id) {
		super(firstName, lastName, favColor);
		empID = id;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + "]";
	}
	
	public void storeEmployee() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		session.save(this);
		trans.commit();
		session.close();
		
		JOptionPane.showMessageDialog(null, "Successful", "Success Window", JOptionPane.INFORMATION_MESSAGE);
	}

}
