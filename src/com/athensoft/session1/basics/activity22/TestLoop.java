package com.athensoft.session1.basics.activity22;

public class TestLoop {

	public static void main(String[] args) {
		//testWhile();
		
		testDoWhile();
		
		testForLoop();
	}
	
	public static void testWhile() {
		int index = 3;
		boolean flag = true;
		while(flag) {
			System.out.println(index);
			index--;		//index = index -1;
		}
		
		while(true) {
			
		}
	}
	
	public static void testDoWhile() {
		int index = -3;
		
		do {
			System.out.println(index);
			index--;
			
		}while(index > 0);
		
	}
	
	public static void testForLoop() {
		
		String[] s= {"s1","s2","s3","s4","s5","s6"};
		
		for(int i=0; i<s.length; i++) {
			if(i>3) break;
			System.out.println(i+":"+s[i]);
			
		}
		
//		for(int i=0; i<10; i++) {
//			
//		}
		
//		for(;;) {
//			//dead-loop
//		}
	}

}
