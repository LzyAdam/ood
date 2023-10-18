package edu.neu.csye6200;

public class ToStringTest {
      public static void main(String[] args) {
		Customer cust1=new Customer(21,"Tom");
		System.out.println(cust1);
		System.out.println(cust1.toString());
		
	}
}




class Customer{
	int age;
	String name;
	public Customer(int age,String name) {
		this.age=age;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Customer [age=" + age + ", name=" + name + "]";
	}
	
	
}