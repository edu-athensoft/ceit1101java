package com.athensoft.session4.oop.activity1;

/**
 * Activity 1.2 - Properties of interfaces
 * @author Athens
 *
 */
public class MiClientApp {
	public static void main(String[] args) {
//		MyInterface m1 = new MyInterface();	//ERROR	section 4-1.1
		
		MiInterface m1;		//OK
		
		MiInterface m2 = new MiClass();	//OK
		
		if(m2 instanceof MiInterface) {
			System.out.println(m2 + " is-a " + MiInterface.class);
		}
	}
}