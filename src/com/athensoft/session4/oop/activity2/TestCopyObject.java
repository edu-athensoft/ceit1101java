package com.athensoft.session4.oop.activity2;

/**
 * @author Athens
 *
 */
public class TestCopyObject {
	public static void main(String[] args) {
		Employee original = new Employee("John", 45000);
		
		Employee copy = original;		//COPY 
		
		copy.raiseSalary(100);
		System.out.println("Original: salary = "+original.getSalary());
		System.out.println("Copy: salary = "+copy.getSalary());
	}
}


