package com.athensoft.session3.oop.activity11;

/**
 * Activity 11 - Implement abstract method
 * @author Athens
 *
 */
public class ClientApp {

	public static void main(String[] args) {
		 final int NUM_OF_PERSON = 2;
		 Person[] people = new Person[NUM_OF_PERSON];
		
		 // fill the people array with Student and Employee objects
		 people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		 people[1] = new Student("Maria Morris", "computer science");
		
		 // print out names and descriptions of all Person objects
		 for (Person p : people)
		 System.out.println(p.getName() + ", " + p.getDescription());

	}

}
