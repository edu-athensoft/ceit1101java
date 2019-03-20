package com.athensoft.session1.basics.activity8;

/**
 * Activity 8 - The boolean type
 * @author ildmost
 *
 */
public class BooleanType {

	public static void main(String[] args) {
		boolean b1 = true;		
		boolean b2 = false;
		
		boolean expr1= b1 && b2;
		System.out.println("expr1="+expr1);
		
		boolean expr2= b1 || b2;
		System.out.println("expr2="+expr2);
		
		
		boolean expr3= b1 ^ b2;
		System.out.println("expr3="+expr3);
		
		boolean expr4= ! b2;
		System.out.println("expr4="+expr4);
		
		boolean expr5= b1 ^ !b2;
		System.out.println("expr5="+expr5);
		
		
		/* try error code*/
		
//		boolean b3= 1;		//ERROR - does not compatible
	}

}
