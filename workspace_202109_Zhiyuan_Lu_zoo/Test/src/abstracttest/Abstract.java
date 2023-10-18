package abstracttest;

public class Abstract {
public static void main(String[] args) {
	//Person p1=new Person;
	//p1.eat();
	Student s=new Student();
	s.walk();
	s.breath();
	
}
}

abstract class Creature{
	public abstract void breath() ;
}
abstract class Person extends Creature{
	String name;
	int age;
	public Person(){
		
	}
       public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	abstract public void eat();
	public void walk() {
		System.out.println("peopel walk");
	}
}
class Student extends Person{
	public void eat() {
		System.out.println("ren chifan ");
	}

	@Override
	public void breath() {
		System.out.println("breathe");
		
	}
	
	
}