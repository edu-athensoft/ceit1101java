package com.athensoft.session2.oop.activity3;

public class OrderItem {
	private int 	seqNo;
	private String 	itemCode;
	private String 	itemName;
	private String 	itemDescription;
	private double 	unitPrice;
	private int		quantity;
	private double	amount;
	
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OrderItem [seqNo=" + seqNo + ", itemCode=" + itemCode + ", itemName=" + itemName + ", itemDescription="
				+ itemDescription + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
	
}
