package com.athensoft.session2.oop.activity3;

/**
 * Dependency
 * 
 * orderClientApp uses order instance
 * 
 * @author ildmost
 *
 */
public class OrderClientApp {

	public static void main(String[] args) {
		Order myorder = new Order();
		
		OrderItem item1 = new OrderItem();
		OrderItem item2 = new OrderItem();
		
		myorder.add(item1);
		myorder.add(item2);
		
		System.out.println(myorder);
	}

}
