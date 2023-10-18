package supertest;

public class Test {
        public static void main(String[] args) {
			Person p1=new Person();
			Man m=new Man();
			m.eat();
			m.age=25;
			System.out.println("*********************************************");
			Person p2=new Man();
			p2.eat();
			p2.walk();
			
			
			
		}
}
