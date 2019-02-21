package com.athensoft.session4.oop.activity6;

/**
 * How to use static inner class through interfaces
 * @author Athens
 *
 */
public class MyClass implements MyInterface{
	public static void main(String[] args) {
		
		MyInterface.Pair p = new Pair(1,2);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
	}
}
