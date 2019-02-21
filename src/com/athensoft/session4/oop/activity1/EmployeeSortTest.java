package com.athensoft.session4.oop.activity1;

import java.util.Arrays;

/**
 * Activity 1 - Using interfaces, implement method in interface
 * 
 * Sorting with Arrays.sort()
 * @author Athens
 *
 */
public class EmployeeSortTest {
	public static void main(String[] args) {
		
		Employee[] staff = new Employee[5];

		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tony Tester", 38000);
		staff[3] = new Employee("Bill Gates", 47000);
		staff[4] = new Employee("Steve Jobs", 63000);

		Arrays.sort(staff);

		// print out information about all Employee objects
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
	}
}
