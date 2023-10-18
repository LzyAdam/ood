package edu.neu.csye6200;

import java.util.Comparator;

public class ComparePersonName implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		//return   o1.getName().compareTo() ;
		return   o1.getName().compareTo(o2.getName());
	
	}
}
