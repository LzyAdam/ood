package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class School {
	public static void demo() {
    	List<Student> studentRoster = new ArrayList<Student>();
    	
    	studentRoster.add(new Student("Arron",25,1234,3.6));
    	studentRoster.add(new Student("Chris",29,1238,3.7));
    	studentRoster.add(new Student("Bob",24,1236,3.5));
    	studentRoster.add(new Student("David",21,1237,3.2));
    	studentRoster.add(new Student("Edward",23,1231,3.1));
    	System.out.println("show student list");
    	System.out.println(studentRoster+"\n");
    	System.out.println("CompareStudentAge");
    	Collections.sort(studentRoster,new CompareStudentAge());
    	System.out.println(studentRoster+"\n");
    	System.out.println("CompareStudentID");
    	Collections.sort(studentRoster,new CompareStudentID());
    	System.out.println(studentRoster+"\n");
    	System.out.println("CompareStudentGpa");
    	Collections.sort(studentRoster,new CompareStudentGpa());
    	System.out.println(studentRoster+"\n");
    	System.out.println("CompareStudentName");
    	Collections.sort(studentRoster,new CompareStudentName());
    	System.out.println(studentRoster+"\n");
    	
    	
    	System.out.println("***********************person*******************");
    	
    	
    	
   	List<Person> personRoster = new ArrayList<>();
//   	List<Student> personRoster=new ArrayList<>();
   	personRoster.add(new Student("Arron1",29,1234,3.6));
//    	person.add(new Student("Bob1",73,1238,3.7));
//    	person.add(new Student("Edward1",58,1237,3.1));
//    	person.add(new Student("Chris1",99,1236,3.5));
//    	person.add(new Student("David1",23,1237,3.2));
    	/*****************************************/
    	Person p1=new Student("Arron1",29,1234,3.6);
    	Person p2=new Student("Arron1",29,1234,3.7);
    	Person p3=new Student("Arron1",29,1234,3.6);
    	Person p4=new Student("Arron1",29,1234,3.3);
    	Person p5=new Student("Arron1",29,1234,3.1);
    	Student s1 = (Student)p1;
    	Student s2 = (Student)p2;
    	Student s3 = (Student)p3;
    	Student s4 = (Student)p4;
    	Student s5 = (Student)p5;
    	personRoster.add(s1);
    	personRoster.add(s2);
    	personRoster.add(s3);
    	personRoster.add(s4);
    	personRoster.add(s5);
    	
    	
    	
    	System.out.println("show person list");
    	System.out.println(personRoster);
    	
    	System.out.println("ComparePersonAge");
    	Collections.sort(personRoster,new ComparePersonAge());
    	System.out.println(personRoster);
    	
    	System.out.println("ComparePersonID");
    	Collections.sort(personRoster,new ComparePersonID());
    	System.out.println(personRoster);
    	
    	System.out.println("ComparePersonName");
    	Collections.sort(personRoster,new ComparePersonName());
    	System.out.println(personRoster);
    
    	//List<Student> student1=(Student)person<>();
    	
//    	System.out.println("CompareStudentGpa");
//    	Collections.sort(person,new CompareStudentGpa());
//    	System.out.println(person);
    	System.out.println("ComparePersonGpa");
    	Collections.sort(personRoster,new ComparePersonGpa());
    	System.out.println(personRoster);
    	
    	//Collections.sort(person,new CompareStudentAge());
    	//System.out.println(student);
//    	Arrays.sort(person,new CompareAge());
//    	System.out.println(person);
//    	Collections.sort(person,new CompareID());
//    	System.out.println(person);
//    	Collections.sort(person,new CompareGpa());
//    	System.out.println(person);
//    	Collections.sort(person,new CompareName());
//    	System.out.println(person);
   
    	/************************************************************/
	}
}
