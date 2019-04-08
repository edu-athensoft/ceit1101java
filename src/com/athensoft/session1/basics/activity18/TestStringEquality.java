package com.athensoft.session1.basics.activity18;

public class TestStringEquality {

	public static void main(String[] args) {
		boolean isEqual = test1("abc","xyz");
		System.out.println(isEqual);
		
		String s1 = "abc";
		String s2 = "abc"+" ";
		s2=s2.trim();
		System.out.println(s1+","+s2);
		boolean isEqual2 = test2(s1,s2);
		System.out.println(isEqual2);

	}
	
	//literal
	public static boolean test1(String s1, String s2) {
		return s1.equals(s2);
	}
	
	
	//address. test if identical object
	public static boolean test2(String s1, String s2) {
		return s1==s2;
	}
	
	

}
