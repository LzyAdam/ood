package Interface;

public class InterfaceTest {
public static void main(String[] args) {
	System.out.println(Flyable.MAX_SPEED);
	System.out.println(Flyable.MIN_SPEED);
	Plane plane=new Plane();
	plane.fly();
}
}

interface Attacable{
	public abstract void attack();
}



interface Flyable {
	public static final int MAX_SPEED=7900;
	public static final int MIN_SPEED=1;
	
	public abstract void fly();
	public abstract void stop();
	
	}
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("fly in sky");
		
	}

	@Override
	public void stop() {
		System.out.println("stop on land");
	}
	
}
class bullet implements Flyable,Attacable{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}