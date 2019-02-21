package com.athensoft.session2.oop.activity4;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Activity 4 - Basic form of a class, structure
 * @author ildmost
 *
 */
public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	//constructor
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		// GregorianCalendar uses 0 for January
		hireDay = calendar.getTime();
	}

	//method
	public String getName() {
		return name;
	}

	//method
	public double getSalary() {
		return salary;
	}

	//method
	public Date getHireDay() {
		return hireDay;
	}

	//method
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	
}
