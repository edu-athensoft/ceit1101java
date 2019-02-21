package com.athensoft.session1.basics;

/**
 * Activity 10 - Constant and final
 * @author ildmost
 *
 */
public class MyConstant {

	public static void main(String[] args) {
		declareConstant();
		
		changeConstant();
	}
	
	public static void declareConstant() {
		final long MY_GRADE = 100L;			//naming in uppercase with _
		System.out.println(MY_GRADE);
		
		final String CITY = "Montreal";		//naming in uppercase
		System.out.println(CITY);
	}
	
	public static void changeConstant() {
		final long a = 100L;
//		a = 80L;			//ERROR - cannot be changed here
		System.out.println(a);
	}

}
