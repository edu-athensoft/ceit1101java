package com.athensoft.session2.oop.activity9;

public class Employee {
	private int id;
	static private int nextId = 1;
	
	public void setId() {
		this.id = nextId;
		nextId++;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
	
}
