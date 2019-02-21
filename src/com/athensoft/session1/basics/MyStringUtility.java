package com.athensoft.session1.basics;

/**
 * Activity 18 - My String Utility
 * @author Athens
 *
 */
public class MyStringUtility {

	public static void main(String[] args) {
		printLength("Mathemetics");		//you may change the string to check its length
		
		testConcatenate("Hello,","Peter!");
		testConcatenate("Win ",649);

		testSubstring(3);
		testSubstring(3,6);
		
		testImmutable();
	}
	
	public static void printLength(String s) {
		System.out.println(s.length());
	}
	
	public static void testConcatenate(String s1, String s2) {
		System.out.println(s1+s2);
	}
	
	public static void testConcatenate(String s1, int s2) {
		System.out.println(s1+s2);
	}
	
	public static void testSubstring(int beginIndex) {
		String s = "0123456789";
		System.out.println(s.substring(beginIndex));
	}
	
	public static void testSubstring(int beginIndex, int endIndex) {
		String s = "0123456789";
		System.out.println(s.substring(beginIndex, endIndex));
	}
	
	public static void testImmutable() {
		
		System.out.println("String is immutable");
		
		String s = "0123456789";
		System.out.print(s+" hash code is:");
		System.out.println(s.hashCode());
		
		s= s+1;		//Change a little bit based on the preceding string
		System.out.print(s+" hash code is:");
		System.out.println(s.hashCode());
	}
	
	

}
