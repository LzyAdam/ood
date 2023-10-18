package edu.neu.csye6200;
/***********************school***************************/
import java.util.*;

public class Person implements Comparable{
	List<Person> Person = new ArrayList<>();
	
    private String name;   
	private int age;
	private int id;
	public Person(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
		
	}
	
	
	
	public List<Person> getPerson() {
		return Person;
	}



	public void setPerson(List<Person> person) {
		Person = person;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Person [  name=" + name + ", age=" + age + ", id=" + id
				+  "]";
	}



//	public void sortPerson() {
//		List<Person> person = new ArrayList<>();
//    	person.add(new Student("Arron",23,1234,3.6));
//    	person.add(new Student("Bob",23,1238,3.7));
//    	person.add(new Student("Chris",23,1236,3.5));
//    	person.add(new Student("David",23,1237,3.2));
//    	person.add(new Student("Edward",23,1237,3.1));
//		Collections.sort(person,new CompareAge());
//    	System.out.println(person);
//    	Collections.sort(person,new CompareID());
//    	System.out.println(person);
//    	Collections.sort(person,new CompareGpa());
//    	System.out.println(person);
//    	Collections.sort(person,new CompareName());
//    	System.out.println(person);
//	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
