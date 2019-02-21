package com.athensoft.session4.oop.activity1;

public class Employee implements Comparable<Employee>{
	private String name;
	private double salary;

	public Employee(String n, double s) {
		name = n;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Employee other) {
		if (salary < other.salary)
			return -1;
		if (salary > other.salary)
			return 1;
		return 0;
	}
}
