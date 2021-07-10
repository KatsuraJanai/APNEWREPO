package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import factory.SessionFactoryBuilder;


@Entity
//@Table(name = "employee")
public class Employee {

	
	@Id
	@Column(name = "employee_id")
	private String empId;
	@Column(name = "Name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "phone")
	private String phone;
	
	
	public  Employee() {
		empId = "";
		name = "";
		address = "";
		phone = "";
	}


	public Employee(String empId, String name, String address, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	public void addEmployee() {
		Session session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(this);
		transaction.commit();
		session.close();
		JOptionPane.showMessageDialog(null, "Student added to database", "Successwndow", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
