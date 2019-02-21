package com.athensoft.session2.oop.activity7;

public class PriceCalculator {
	private double price;
	private int quantity;
	private double totalAmount;
	private String provinceName;
	
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public 	PriceCalculator(final double price, final int quantity, final String provinceName) {
		this.price = price;
		this.quantity = quantity;
		this.provinceName = provinceName.toUpperCase();
	}
	
	private double taxHelper() {
		double taxRate = 0;
		if(this.provinceName.equalsIgnoreCase("QC")) {
			final double GST_RATE = 0.05;
			final double QST_RATE = 0.0975;
			taxRate = GST_RATE + QST_RATE;
		}else {
			final double HST_RATE = 1.12;
			taxRate = HST_RATE;
		}
		return taxRate;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		
		totalAmount = price*(1+taxHelper())*this.quantity;
				
		return totalAmount;
	}
	
	
	
	
}
