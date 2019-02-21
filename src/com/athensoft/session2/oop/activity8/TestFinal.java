package com.athensoft.session2.oop.activity8;

public class TestFinal {

	/*
	 *OK - if it is initialized by constructor 
	 *ERROR - if there is no constructor to initialize it, it must be initialized right after being declared
	 */
	
	private final String name;	
	
//	private final String name = "Peter";		//OK
	
	public static void main(String[] args) {

	}
	
	public TestFinal(String name) {
		this.name = name;
	}

}
