package com.athensoft.session3.oop.activity2;

/**
 * Activity 2 - Inheritance
 * @author Athens
 *
 */
public class Manager extends Employee {
	
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getHireDate()=" + getHireDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
