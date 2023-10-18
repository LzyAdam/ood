package edu.neu.csye6200;

import java.util.Comparator;

public class ComparePersonAge implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
	
}