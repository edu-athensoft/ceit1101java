package com.athensoft.session2.oop.activity6;

/**
 * Activity 6 - Constructor
 * @author Athens
 *
 */
public class MyConstructor {
	
	
	//step 1
	private int 	field1;
	private char 	field2;
	private boolean field3;
	private float 	field4;
	
	//step 2.1
	public MyConstructor() {
		
	}
	
	//step 2.2
	//watch out the name of constructor parameter and the this.field name
	public MyConstructor(int field1, boolean field3) {
		this.field1 = field1;
		this.field3 = field3;
	}
	
	//step 3
	@Override
	public String toString() {
		return "MyConstructor [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ "]";
	}

	//step 4
	public static void main(String[] args) {
		MyConstructor my1 = new MyConstructor();
		System.out.println(my1);
		
		MyConstructor my2 = new MyConstructor(33,true);
		System.out.println(my2);
	}
}
