package javainner;

public class InnerClassTest {
         public static void main(String[] args) {
			Person.Dog dog=new Person.Dog();
			//Person dog1=new Dog();
			dog.show();
			Person p=new Person();
			//
			Person.Bird bird=new Person.Bird();
			bird.sing();
			System.out.println("******************");
			bird.display("cc");
			
		}
}
class Person{
	String name="AA";
	int age;
	public void eat() {
		System.out.println("people eat");
	}
	
	
	  static class Dog{
		String name;
		int age;
		public void show() {
			System.out.println("dog is a dog");
		}
	}
	
	static class Bird{
		String name="BB";
		public Bird(){
		}
		public void sing() {
			System.out.println("singsingsingBird singing");
			//eat();
		}
		public void display(String name) {
			System.out.println(name);
			System.out.println(this.name);
			//System.out.println(Person.name);
		}
	}
	
	public void method() {
		class AA{
			
		}
	}
	
	
}