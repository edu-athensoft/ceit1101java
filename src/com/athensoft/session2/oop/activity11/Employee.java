package com.athensoft.session2.oop.activity11;

/**
 * Activity 11 - Call by value - passing a reference
 * @author Athens
 *
 */
public class Employee {
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
