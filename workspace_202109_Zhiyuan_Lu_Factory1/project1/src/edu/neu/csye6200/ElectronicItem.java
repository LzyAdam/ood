package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ElectronicItem implements Item {
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
	public ElectronicItem(int iD, String name, double price) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
	}
	
	public ElectronicItem() {
		super();
	}
	@Override
	public String toString() {
		return "ElectronicItem [ID=" + ID + ", name=" + name + ", price=" + price + "]";
	}
	/********readElectronicItems********/
	public List<ElectronicItem> readElectronicItems() throws IOException {
		List<ElectronicItem> electronicitem=new ArrayList<>();
		
		try(BufferedReader inLine=new BufferedReader(new FileReader(new File("ElectronicItemCSV.txt")));
	){	String inputLine=null;
		while((inputLine=inLine.readLine())!=null) {
			String[] fields=inputLine.split(",");
			int ID=0;
			double price=0.0;
			try {
				ID = Integer.parseInt(fields[0]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[0] + "'" + " is INVALID String representation of int vlaue.");
				e.printStackTrace();
			}

			String name = fields[1];

			try {
				price = Double.parseDouble(fields[2]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[2] + "'" + " is INVALID String representation of double vlaue.");
				e.printStackTrace();
			}
			
			electronicitem.add(new ElectronicItem(ID,name,price));

		}	
			
		}
		return electronicitem;
		}	

}
