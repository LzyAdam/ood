package edu.neu.csye6200;

import java.util.Comparator;

public class CompareStudentGpa implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return   Double.compare(o1.getGpa(), o2.getGpa());
	}
	
}