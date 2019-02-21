package com.athensoft.session3.oop.activity5;

import java.util.Date;

public class ClientApp {
	public static void main(String[] args) {
//		Manager m = new Manager();
		Manager m = new Manager("Athens",800000, new Date());
		m.setName("Athens");
		
		System.out.println(m.getSalary());
	}
}
