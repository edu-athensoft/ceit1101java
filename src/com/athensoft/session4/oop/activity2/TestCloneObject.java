package com.athensoft.session4.oop.activity2;

/**
 * https://blog.csdn.net/zhangjg_blog/article/details/18369201
 * @author Athens
 *
 */
public class TestCloneObject {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee original = new Employee("John", 45000);
		
		Employee copy = (Employee) original.clone();		//CLONE - default shadow copy
		
		copy.raiseSalary(100);
		System.out.println("Original: salary = "+original.getSalary());
		System.out.println("Copy: salary = "+copy.getSalary());
	}
}
