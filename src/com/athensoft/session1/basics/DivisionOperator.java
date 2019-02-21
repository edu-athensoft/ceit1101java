package com.athensoft.session1.basics;

/**
 * Activity 13 - Division with zero
 * @author ildmost
 *
 */
public class DivisionOperator {

	public static void main(String[] args) {
//		testDivisionByZero(10);		//ERROR - ArithmeticException
		
		testDivisionByZero(10.0);

	}
	
	public static void testDivisionByZero(double a) {
		System.out.println(a/0);
	}
	
	public static void testDivisionByZero(int a) {
		System.out.println(a/0);
	}

}
