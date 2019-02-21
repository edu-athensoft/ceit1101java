package com.athensoft.session2.oop.activity10;

public class Employee {
	private int id;
	static private int nextId = 1;
	
	public void setId() {
		this.id = nextId;
		nextId++;
	}
	
	public static int getNextId() {
		return nextId;	//OK, because nextId is static 
//		return id;	//ERROR cannot access a non-static field here, because it is a static environment
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
	
}
