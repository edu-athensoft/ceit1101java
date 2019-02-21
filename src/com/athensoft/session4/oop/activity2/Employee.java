package com.athensoft.session4.oop.activity2;

/**
 * @author Athens
 *
 */
public class Employee implements Cloneable{
	private String name;
	public String getName() {
		return name;
	}

	
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public double raiseSalary(double amount) {
		return this.salary += amount;
	}
	
	public double getSalary() {
		return this.salary;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}