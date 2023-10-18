package Assignment1_zoo;

public class ExtendTest {
public static void main(String[] args) {
	People p1=new People();
	p1.age=2;
	p1.eat();
	p1.sleep();
	
	
	Student s1=new Student();
	s1.age=3;
	s1.sleep();
	s1.eat();
	s1.study();
	s1.major="chemistry";
	
	System.out.println(s1.major);
	s1.breathe();
	
	
}
}
