package edu.neu.csye6200;

public interface Factory {
	//Item create();
	Item create(int ID, String name, double price);

	
}
