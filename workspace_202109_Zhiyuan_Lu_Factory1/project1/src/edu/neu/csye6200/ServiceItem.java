package edu.neu.csye6200;

public class ServiceItem implements Item {
	private int ID;
	private String name;
	private double price;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ServiceItem(int iD, String name, double price) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
	}
	
	public ServiceItem() {
		super();
	}
	@Override
	public String toString() {
		return "ServiceItem [ID=" + ID + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
