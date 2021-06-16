package date;

import java.io.Serializable;

public class MyDate implements Serializable {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int day;
	private int month;
	private int year;
	
	
	
	public MyDate() {
		day = 0;
		month = 0;
		year = 0;
	}
	
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date of birth is:" + day + "/" + month + "/" + year;
	}
	
	
	
	

}
