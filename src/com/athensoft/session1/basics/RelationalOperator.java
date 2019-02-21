package com.athensoft.session1.basics;

/**
 * Activity 15 - Relational Operators
 * @author ildmost
 *
 */
public class RelationalOperator {

	public static void main(String[] args) {
		shortCircuit();
		
		testLogicalAnd(true, false);
		
		testLogicalOr(false, true);
		
		testNegation(false);
		
		testTenaryOperator(3,5);	//try more times

	}
	
	public static void testLogicalAnd(boolean expr1, boolean expr2) {
		System.out.println(expr1&&expr2);
	}
	
	public static void testLogicalOr(boolean expr1, boolean expr2) {
		System.out.println(expr1||expr2);
	}
	
	public static void testNegation(boolean expr1) {
		System.out.println(!expr1);
	}
	
	public static void testTenaryOperator(int a, int b) {
		String result = a>b ? "YES, a > b": "NO, a<b";
		System.out.println(result);
	}
	
	@SuppressWarnings("unused")
	public static void shortCircuit() {
		boolean a = false;
		boolean exp1 = 5 > 9 && (a = true);
		if(exp1) {
			System.out.println("a="+a);
		}else {
			System.out.println("a="+a);
			System.out.println("a = true was not executed actually, that's short circuit!");
		}
	}

}
