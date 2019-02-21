package com.athensoft.session3.oop.activity11;

public class Student extends Person {
	
	public Student(String n, String m) {
		// pass n to superclass constructor
		super(n);
		major = m;
	}

	@Override
	public String getDescription() {
		return "a student majoring in " + major;
	}

	private String major;
}
