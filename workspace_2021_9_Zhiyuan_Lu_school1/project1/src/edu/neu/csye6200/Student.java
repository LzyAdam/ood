package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JSpinner.DefaultEditor;

import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student extends Person{
//public class Student extends Person implements Comparator<Student> {
//List<Student> Student = new ArrayList<>();
	
	private double gpa;
	
	
	
	
	
	public Student(String name, int age, int id, double gpa) {
	super(name, age, id);
	this.gpa = gpa;
}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Student [name="+getName()+", age="+getAge()+",id=" +getId()+",Gpa=" + gpa + "]"+"\n";
	}



	public String getName() {
		return super.getName();
	}

	/*

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

*/
	
	 
  /*********************Peter slide code**************************************/
	
	
	
	
	
}

