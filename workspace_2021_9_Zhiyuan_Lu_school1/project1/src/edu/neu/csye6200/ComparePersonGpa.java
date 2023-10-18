package edu.neu.csye6200;

import java.util.Comparator;

public class ComparePersonGpa implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		// TODO Auto-generated method stub
		return   Double.compare(s1.getGpa(), s2.getGpa());
	}
	
}