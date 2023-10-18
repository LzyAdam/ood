package Assignment1_zoo;

public class Usertest {
   
public static void main(String[] args) {
  User u1 =new User();
  u1.age=1;
  System.out.println(u1.age);
  System.out.println(u1);
}

}

class User{
	 int age;
	String name;
	boolean isMale;
	//Field
	public void talk(String language){
		//language="Chinese";
		System.out.println("baskcds"+language);
	}
	public void eat() {
		System.out.println("customer eat");
		
	}
	public void sleep(int hour) {
		System.out.println("sleep"+ hour);
	}
	public String getName() {
		return name;
	}
	public String getNation(String nation) {
		return nation;
	}
	
	
}