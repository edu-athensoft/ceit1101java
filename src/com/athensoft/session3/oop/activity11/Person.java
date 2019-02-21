package com.athensoft.session3.oop.activity11;

/**
 * Activity 11
 * @author Athens
 *
 */
public abstract class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getDescription();
	
}
