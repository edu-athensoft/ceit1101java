package com.athensoft.session3.oop.activity2;

import java.util.Date;

/**
 * Activity 2 - Inheritance
 * @author Athens
 *
 */
public class ClientApp {

	public static void main(String[] args) {
		Employee peter = new Employee();
		
		//private fields of employee are invisible
		//we can access following:
		peter.setName("Peter");
		peter.setSalary(80000);
		peter.setHireDate(new Date());
		
		peter.getHireDate();
		peter.getName();
		peter.getSalary();
		
		
		Manager tom = new Manager();
		
		//private fields of manager are invisible
		//we can access following:
		tom.setName("Tom");
		tom.setSalary(100000);
		tom.setHireDate(new Date());
		tom.setBonus(3000);
		
		tom.getName();
		tom.getSalary();
		tom.getHireDate();
		tom.getBonus();
		
		System.out.println(tom.toString());
		
	}

}
