package com.athensoft.session1.basics.activity16;

/**
 * Activity 16 - Conversion and Cast
 * @author Athens
 *
 */
public class ConversionAndCast {

	public static void main(String[] args) {
		testConversion();
		testCast();
	}
	
	public static void testConversion() {
		int a = 10;
		double b = a;
		System.out.println(b);
	}
	
	public static void testCast() {
		double a = 10;		//Why this is ok?
		int b = (int)a;
		System.out.println(b);
	}

}
