package com.athensoft.session2.oop.activity3;

/**
 * Aggregation
 * @author ildmost
 *
 */
public class Office {
	private Table table = new Table();	//has-a
	private Chair chair = new Chair();	//has-a 
	
	@Override
	public String toString() {
		return "Office [table=" + table + ", chair=" + chair + "]";
	}
	
	
}
