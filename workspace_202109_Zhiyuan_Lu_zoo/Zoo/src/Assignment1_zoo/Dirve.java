package Assignment1_zoo;



public class Dirve {
     public static void main (String[] args){
    	 System.out.println("hello world!");
    	 System.out.println("hello world");
    	Person p1 = new Person();  
    	p1.name="Tom";
    	p1.isMale=true;
    	p1.age=1;
    	p1.eat();
    	p1.sleep();
    	p1.talk("Chinese");
    	System.out.println("my name is " + p1.name);
    	System.out.println(p1.age);
    	System.out.println(p1.isMale);
    	
    	
    	Person p2=new Person();
    	
    	System.out.println(p2.name);
    	System.out.println(p2.isMale);
    	p2.isMale=true;
    	System.out.println(p2.isMale);
    	
    	Person p3=p1;
    	System.out.println(p3.name);
    	System.out.println(p3.age);
    	System.out.println(p3.isMale);
    	p3.age=10;
    	System.out.println(p3.age);
    	System.out.println(p1.age);
    	
    	Horse h1=new Horse();
    	//h1.age=3;
    	h1.color=("white");
    	System.out.println(h1.age);
    	System.out.println(h1.color);
    	h1.run("fast");
    	
    	
    	
    	
    	
     }
}

 class Person{
	 int age;
	 String name;
	 boolean isMale;
	 //Field
	 public void eat() {
		  System.out.println("People can eat");
	 }
	 
	 public void sleep() {
		 System.out.println("people can sleep ");
		 
	 }
	 public void talk(String language) {
		 System.out.println("people can talk"+ language);
		 //class
	 }
 
	 	 
 }  
 
 
 
 
 class Horse{
	 String color;
	 int age=2;
	 public void run(String speed) {
		 System.out.println("run: "+ speed);
	 }	
	 
 }