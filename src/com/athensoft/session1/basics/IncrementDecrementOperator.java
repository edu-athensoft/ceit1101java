package com.athensoft.session1.basics;

/**
 * Activity 14 - Increment and Decrement Operators
 * @author ildmost
 *
 */
public class IncrementDecrementOperator {

	public static void main(String[] args) {
		test();
		
		compare();
	}
	
	public static void test() {
		int a = 12;
		a++;
		System.out.println("a="+a);
		
		++a;
		System.out.println("a="+a);
	}
	
	public static void compare() {
		int m = 7;
		int n = 7;
		int a = 2 * ++m; // now a is 16, m is 8
		int b = 2 * n++; // now b is 14, n is 8
		
		System.out.println("a="+a+"\t"+"b="+b+"="+"\t"+"m="+m+"\t"+"n="+n);
	}
	

}
