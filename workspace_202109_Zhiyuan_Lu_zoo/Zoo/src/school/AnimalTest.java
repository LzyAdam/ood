package school;

public class AnimalTest {
         public static void main(String[] args) {
			Animal a=new Animal();
			//a.age=1;
			a.name=("Tom");
			//a.legs=4;
			a.eat();
			//a.show();
			a.setlegs(6);
			//a.show();
			//a.getlegs(6);
			//a.show();
			a.setage(8);
			//a.show();
			a.getage();
			a.show();
		}
}




class Animal{
	String name;
	private int age;
	private int legs;
	
	public int getage() {
		return age;
	}
	
	public void setage(int a) {
		if(a<=100&&a>=0) {
			age=a;
		}else {
			age=0;
		}
	}
	
	
	
	public int getlegs() {
		return legs;
	}
	
	public void setlegs(int l) {
		if(l>=0&&l%2==0){
			legs=l;
		}else { 
			legs=0;
		}
		
	}
	
	public void eat(){
		System.out.println("eat");
	}
	
	public void show() {
		System.out.println("name= "+name+" ,age= "+age+" ,legs= "+legs);
	}
}
