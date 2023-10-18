package supertest;

public class Women extends Person {

	boolean isBeauty;
	public void goShopping() {
		System.out.println("shopping");
	}
	
	public void eat() {
		System.out.println("weomen eat");
	}
   public void walk() {
	   System.out.println("woman walk");
	  this.eat();
	  super.eat();
   }
	
}
