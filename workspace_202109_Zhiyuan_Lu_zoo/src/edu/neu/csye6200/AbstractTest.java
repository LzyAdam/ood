package edu.neu.csye6200;

public class AbstractTest {
   public static void main(String[] args) {
	//Person p1=new Person();
	//p1.eat();
	Student s1=new Student();
	s1.age=88;
	s1.study();
	System.out.println(s1.age);
}
}
abstract class Person{
	int age;
	String name;
	public Person() {
		
	} 
	public Person(int age,String name) {
		this.name=name;
		this.age=age;
	}
	abstract public void eat();
	
	abstract public void walk(); 
}
class Student extends Person{
	public void study() {
		
		
		System.out.println("people can study");
		System.out.println("*********************************************");
		//eat();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}