package edu.neu.csye6200;

import java.util.Comparator;

public class CompareLastName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return   o1.getLastname().compareTo(o2.getLastname()) ;
	}
}