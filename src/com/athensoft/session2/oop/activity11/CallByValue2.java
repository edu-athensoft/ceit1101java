package com.athensoft.session2.oop.activity11;

/**
 * Activity 11 Call by Value (pass a reference type)
 * @author Athens
 *
 */
public class CallByValue2 {

	public static void main(String[] args) {
		//step 1. create an employee object
		double originalSalary = 80;			//80k a year
		Employee peter = new Employee(originalSalary);
		System.out.println("original salary is:"+peter.getSalary()+" k.");
		System.out.println("outside employee object is "+ peter.hashCode());
		
		//step 2. raise salary
		peter = raiseSalary(peter);		//peter -> emp
		
		//step 3. check current salary
		System.out.println("current salary is:"+peter.getSalary()+" k.");
				
	}
	
	public static Employee raiseSalary(Employee emp) { 	//here we pass a reference in
		double raisedSalary = 2 * emp.getSalary();
		emp.setSalary(raisedSalary);		// salary = 2 * salary
		System.out.println("in raiseSalary(), employee object is "+ emp.hashCode());
		return emp;							//the original employee references
	}

}
