package domain;

public abstract class Employee {

	protected String ID;
	protected String name;
	protected String phone;
	protected double salary;
	protected double hoursWorked;
	
	//DEFAULT CONSTRUCTOR
	public Employee()
	{
		ID = "";
		name = "";
		phone = "";
		salary = 0;
		hoursWorked = 0;
	}
	
	
	
	//PRIMARY CONSTRUCTOR
	public Employee(String iD, String name, String phone, double salary, double hoursWorked) {
		super();
		ID = iD;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}
	
	//Primary CONSTRUCTOR
	/*public Employee(String iD, String name, String phone,double hoursWorked) 
	{
		ID = iD;
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.phone = phone;		
	}*/




	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}




	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", phone=" + phone + ", salary=" + salary + ", hoursWorked="
				+ hoursWorked + "]";
	}
	
	
	public abstract double CalculatePay();
	
	
	
	
}
