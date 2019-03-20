package com.athensoft.session1.basics.activity11;

/**
 * Activity 11 - Arithmetic operators
 * @author ildmost
 *
 */
public class ArithmeticOperator {

	public static void main(String[] args) {
		testAddition(2,3);
		
		testSubtraction(2,3);
		
		testMultiplication(2,3);
		
		testDivition(2,3);
		
		testRemainder(2,3);

	}
	
	public static void testAddition(int a, int b) {
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
		System.out.println("a+b="+(a+b));
	}
	
	public static void testSubtraction(int a, int b) {
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
		System.out.println("a-b="+(a-b));
	}
	
	public static void testMultiplication(int a, int b) {
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
		System.out.println("a*b="+(a*b));
		
		double d = b;
		System.out.println("a*b="+(a*d));
	}
	
	public static void testDivition(int a, int b) {
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
		System.out.println("a/b="+(a/b));
		
		double d = b;
		System.out.println("a/b="+(a/d));
	}
	
	public static void testRemainder(int a, int b) {
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
		System.out.println("a%b="+(a%b));
		
		double d = b;
		System.out.println("a%b="+(a%d));
	}

}
