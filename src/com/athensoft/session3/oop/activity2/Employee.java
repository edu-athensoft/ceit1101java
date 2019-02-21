package com.athensoft.session3.oop.activity2;

import java.util.Date;

/**
 * Activity 2 - Inheritance
 * @author Athens
 *
 */
public class Employee {
	private String name;
	private double salary;
	private Date hireDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
