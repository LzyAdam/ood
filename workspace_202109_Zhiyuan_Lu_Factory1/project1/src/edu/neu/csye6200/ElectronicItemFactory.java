package edu.neu.csye6200;

public class ElectronicItemFactory implements Factory {
	private ElectronicItemFactory() {
		
	}
	private static ElectronicItemFactory eif=null;
	public static ElectronicItemFactory getInstance() {
		if(eif==null) {
			eif=new ElectronicItemFactory();
		}
		return eif;
	}
	@Override
	public Item create(int ID, String name, double price) {
		// TODO Auto-generated method stub
		return new ElectronicItem(ID,  name,  price);
	}

	//@Override
//	public Item create() {
//		// TODO Auto-generated method stub
//		return new ElectronicItem(ID,  name,  price);
//	}

}
