package com.athensoft.session3.oop.activity3;

/**
 * Activity 3 - Override
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
	
	public double getSalary() {
//		return this.bonus + getSalary();		//ERROR occurs when the ClientApp runs
//		return this.bonus + this.getSalary();	//ERRIR occurs the same as above
		
		return this.bonus + super.getSalary();	//works using super
	}

}
