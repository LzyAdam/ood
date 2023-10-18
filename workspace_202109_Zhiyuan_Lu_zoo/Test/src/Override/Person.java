package Override;

public class Person {
   int age;
   String name;
   public Person() {
	   
   }
   public Person(int age, String name) {
	   this.age=age;
	   this.name=name;
   }
   public void eat() {
	   System.out.println("Person can eat");
   }
   public void walk(int distance) {
	   System.out.println("person can walk"+distance);
   }
}
