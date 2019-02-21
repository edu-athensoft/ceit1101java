package com.athensoft.session2.oop.activity10;

/**
 * @author Athens
 *
 */
public class TestStaticMethod {
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			int globalId = Employee.getNextId();
			
			new Employee().setId();	//OK, because we are using object
//			Employee.setId();		//ERROR, why? check the error message from IDE
			
			System.out.println(globalId);
		}
		
	}
}
