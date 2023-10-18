package edu.neu.csye6200;

public class FoodItemFactory implements Factory{



	@Override
	public Item create(int ID, String name, double price) {
		// TODO Auto-generated method stub
		return  new FoodItem( ID,  name,  price);
		//return  new FoodItem();
	}

	

}
