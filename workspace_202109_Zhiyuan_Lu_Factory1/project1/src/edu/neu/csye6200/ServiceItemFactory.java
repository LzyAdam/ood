package edu.neu.csye6200;

public final class ServiceItemFactory implements Factory {
	private ServiceItemFactory() {
	}
	private static ServiceItemFactory sif =new ServiceItemFactory();
	public static ServiceItemFactory getInstance() {
		return sif;
	}
	@Override
	 public Item create(int ID, String name, double price) {
		// TODO Auto-generated method stub
		 return new ServiceItem(ID,  name,  price);
	}
	

}
