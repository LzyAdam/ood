package supertest;

public class Man extends Person {
   boolean isSmoking;
	
   
	public void eat() {
		System.out.println("Man eat");
	}
   public void walk() {
	   System.out.println("man walk");
	  this.eat();
	  super.eat();
   }
   
}
