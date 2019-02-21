package com.athensoft.session1.basics;

/**
 * Activity 5 - Variable type and how to use them
 * @author ildmost
 *
 */
public class JavaVarType {
	public static String myName = "Peter" ;
	
	private int myStudentNum = 1810113;
	
	public static void main(String[] args) {
		double myScore = 90.0;
		
		//class var
		System.out.println("Class variable is:"+JavaVarType.myName);
		
		//instance var
		JavaVarType jvt = new JavaVarType();
		System.out.println("Instance variable is:"+jvt.myStudentNum);
		
		//local var
		System.out.println("Local variable is:"+myScore);
	
	}
}
