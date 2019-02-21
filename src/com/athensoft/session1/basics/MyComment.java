package com.athensoft.session1.basics;

/**
 * @author ildmost
 *
 */
public class MyComment {
	
	/**
	 * 
	 */
	private String name;
	
	
	/**
	 * 
	 */
	private int age;
	
	/**
	 * 
	 */
	private double grade;
	
	
	/**
	 * @param rankNum the number of my rank in grade
	 */
	public void printRank(int rankNum) {
		/* print out my rank number */
		System.out.print("My rank is no.: "+rankNum);	//rank number, a positive integer
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
