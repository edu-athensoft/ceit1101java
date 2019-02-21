package com.athensoft.session2.oop.activity3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Composition
 * setter and getter are ommitted
 * 
 * @author ildmost
 *
 */
public class Order {
	
	private long orderNo;
	private Date orderDate;
	private String clientName;
	private double totalAmount;
	private double gst;
	private double qst;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();		//this is composition, why?
	
	public void add(OrderItem item) {
		this.items.add(item);
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDate=" + orderDate + ", clientName=" + clientName
				+ ", totalAmount=" + totalAmount + ", gst=" + gst + ", qst=" + qst + ", items=" + items + "]";
	}
	
	
	
}
