package school;

public class PersonTest {
	public static void main(String[] args) {
		//Person p1=new Person();
		//p1.setage(23);
		//System.out.println(p1.getage());
		 Person p3=new Person(9,"Tom" );
		 //System.out.println(p2.getname());
	}

}

class Person1{
	private String name;
    private int age;
    
    
    public Person() {
    	this.eat();
    	String info=("qwertyuuuuuuuuuuuiooop");
    	System.out.println(info);
    }   
    
    public Person(String name) {
//    	this();//use this cons
    	this.name=name;
    	System.out.println(this.name);
    }
    
   public Person(int age) {
//    	this(name);
    	this.age=age;
    	System.out.println(this.age );
    } /**/
    public Person(int age, String name) {
    	
    	this.age =age;
    	
    	this.name=name;
    	String info=("aaaaaap");
    	System.out.println(info);
    }
    
//    public Person(int age, String name) {
//    	
//    	this.age = age;
//    	this.name=name;
//    	String info=("aaaaaap");
//    	System.out.println(info);
//    }
   
   public void eat() {
	   System.out.println("eat fast food");
   } 
   /*  public void setname(String name) {
    	this.name=name;
    }
    
    public String getname() {
    	return this.name;
    }
    public void setage(int age) {
    	this.age=age;
    }
    public int getage() {
    	return age;
    }*/
    
}