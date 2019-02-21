package com.athensoft.session2.oop.activity9;

public class TestStaticField {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId();
		System.out.println(emp1);
//		System.out.println(Employee.nextId);	//ERROR we cannot see nextId, why? how to access it from here?
		
		Employee emp2 = new Employee();
		emp2.setId();
		System.out.println(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId();
		System.out.println(emp3);
		
		//how to let employee class automatically assign an Id when it is constructed?
		
	}
}
