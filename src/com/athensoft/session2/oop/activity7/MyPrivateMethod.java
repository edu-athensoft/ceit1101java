package com.athensoft.session2.oop.activity7;

/**
 * Activity 7 - private method
 * @author Athens
 *
 */
public class MyPrivateMethod {

	public static void main(String[] args) {
		PriceCalculator pc = new PriceCalculator(15.5, 8, "on");	//(price, quantity, province name)
		System.out.println("Price: "+pc.getPrice());
		System.out.println("Qty: "+pc.getQuantity());
		System.out.print("Province: "+pc.getProvinceName()+"\t");
		System.out.println("Total Amount: "+pc.getTotalAmount()+"\n");
		
		pc = new PriceCalculator(15.5, 8, "qc");	//(price, quantity, province name)
		System.out.println("Price: "+pc.getPrice());
		System.out.println("Qty: "+pc.getQuantity());
		System.out.print("Province: "+pc.getProvinceName()+"\t");
		System.out.println("Total Amount: "+pc.getTotalAmount());

	}

}
