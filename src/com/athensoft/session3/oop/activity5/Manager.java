package com.athensoft.session3.oop.activity5;

import java.util.Date;

public class Manager extends Employee {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//comment this constructor out to see what happen
	public Manager(String name, double salary, Date hireDate) {
		super(name,salary,hireDate);
	}
	
	
	//override
	public double getSalary() {
		this.bonus = 108;
		return this.bonus + super.getSalary();
	}
	
	
}
