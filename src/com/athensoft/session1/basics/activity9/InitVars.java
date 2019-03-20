package com.athensoft.session1.basics.activity9;

/**
 * Activity 9 - Initializing variables
 * @author ildmost
 *
 */
public class InitVars {

	public static void main(String[] args) {
		
		threeSteps();
		twoSteps();
	
	}
	
	public static void threeSteps() {
		int a;
		
		a = 10;		//ERROR, to mark this to see what happens
		
		System.out.println(a);
	}
	
	public static void twoSteps() {
		int a = 10;	
		
		System.out.println(a);
	}
	
	public static void typeSuffix() {
		long a = 10L;	
		
//		long a = 10;		//OK - why it is correct?  upper cast (int -> long)
		
		System.out.println(a);
		
//		float b = 10.0;		//ERROR - why?
		
//		double d = b;		//OK - why it is correct?  upper cast (float -> double)
		
//		System.out.println(b);
	}

}
