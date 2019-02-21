package com.athensoft.session2.oop.activity11;

/**
 * Activity 11 - Call by Value (pass a primitive or immutable object)
 * @author Athens
 *
 */
public class CallByValue {
	
	private int count = 10;
	
	public int addBonus(int bonus) {
		bonus++;
		this.count += bonus;
		System.out.println("in addBonus, bonus is :"+bonus);
		return this.count;
	}
	
	
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int bonus = 2;				
		System.out.println("bonus before being passed: "+bonus);
		cbv.addBonus(bonus);
		System.out.println("bonus after being passed: "+bonus);	//not changed
		
	}
}
