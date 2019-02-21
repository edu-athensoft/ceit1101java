package com.athensoft.session3.oop.activity4;

public class Manager extends Employee {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//override
	public double getSalary() {
		this.bonus = 108;
		return this.bonus + super.getSalary();
	}
	
	
}
