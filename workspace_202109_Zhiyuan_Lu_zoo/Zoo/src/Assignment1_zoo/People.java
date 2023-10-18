package Assignment1_zoo;

public class People extends Creature{

	String name;
	int age;
	
	public People() {}
	
	public People(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("eat a lot");
	}
	
	public void sleep() {
		System.out.println("sleep an hour");
	}
	
	
	
}
