package com.athensoft.session3.oop.activity10;

/**
 * Activity 10.4 - Declare an abstract class
 * 
 * with constructor(s), this is legal !!!
 * 
 * @author Athens
 *
 */
public abstract class AbstractPerson5 {
	
	//this is legal
	public AbstractPerson5() {
		
	}
		
	public abstract String getName();
	public abstract int getAge();
	
	public static void main(String[] args) {
//		AbstractPerson4 ap4 = new AbstractPerson4();	//ERROR
	}
}
