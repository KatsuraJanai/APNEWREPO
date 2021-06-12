package domain;

public class PartTimeEmployee extends Employee implements Payable{

	
	private double BASICPAYRATE = 3575.65;
	private double overTimePay;
	
	
	
	
	
	@Override
	public double CalculatePay() {
		if(hoursWorked <= 6) {
			return salary = BASICPAYRATE * hoursWorked;
		}
		return  BASICPAYRATE * 6 + calculateOverTime();
	}

	@Override
	public double calculateOverTime() {
		// TODO Auto-generated method stub
		if(hoursWorked > 6) 
		{
			overTimePay = (BASICPAYRATE * (hoursWorked - 6) * OVTRATE);
			return overTimePay;
		}
		return 0;
	}
	
	public PartTimeEmployee() {
		super();
		BASICPAYRATE = 3575.65;
		setOverTimePay(0);
	}

	public PartTimeEmployee(double bASICPAYRATE, double overTimePay) {
		super();
		BASICPAYRATE = bASICPAYRATE;
		this.setOverTimePay(overTimePay);
	}

	public PartTimeEmployee(String id, String name, String phone, double hoursWorked) 
	{
		//super(id, name,phone,hoursWorked);
		super();
		this.ID = id;
		this.name = name;
		this.phone = phone;
		this.hoursWorked = hoursWorked;
	}

	public double getOverTimePay() {
		return overTimePay;
	}

	public void setOverTimePay(double overTimePay) {
		this.overTimePay = overTimePay;
	}
	
	
	
}
