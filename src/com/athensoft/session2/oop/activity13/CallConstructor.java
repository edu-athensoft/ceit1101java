package com.athensoft.session2.oop.activity13;

/**
 * Activity 13 - The process of calling a constructor
 * @author Athens
 *
 */
public class CallConstructor {
	
	
	private int a = 2;										//step 1. initialize instance fields
	
	public CallConstructor() {								
		System.out.println("3. in the constructor, a="+this.a);	//step 3. execute constructor body
	}
	
	
	public static void main(String[] args) {
		new CallConstructor();
	}
	
	
	//this block must be placed after the statement that declares the variable a, so that a can be used here
	{
		System.out.println("1. in the init block, a="+a);	//step 2
		a = 1;
		System.out.println("2. in the init block, a="+a);	//step 2
	}
	//The block is not commonly used!  Just for a demo, if necessary, place the code into a constructor
}
