package com.athensoft.session1.basics.activity12;

public class RemainerOperator {

	public static void main(String[] args) {
		//a>0, b>0
		int a = 2;
		int b = 3;
		testCase1(a,b);
		testCase1(b,a);
		
		//cd<0
		int c = -2;
		int d = 3;
		testCase1(c,d);
		testCase1(d,c);
		
		//e<0, f<0
		int e = -2;
		int f = -3;
		testCase1(e,f);
		testCase1(f,e);
		
	}

	public static void testCase1(int x, int y){
		System.out.println(x+"%"+y+"="+x%y+"\n");
	}
	
	
}
