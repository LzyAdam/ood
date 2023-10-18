package edu.neu.csye6200;

public class Interfacetest {
    public static void main(String[] args) {
		System.out.println(Flable.MAX_SPEED);
		Plane p1=new Plane();
		p1.fly();
		p1.stop();
		Kites k1=new Kites();
		k1.fly();
		k1.stop();
		Bullet b1=new Bullet();
		b1.shoot();
		b1.fly();
		b1.stop();
		
	}
  
}
interface Attack{
	public abstract void shoot();
	
}
interface Flable{
	
	public static final int MAX_SPEED=7900;
	
	public abstract void fly();
	
	public abstract void stop();
	
	
}
class Plane implements Flable{

	@Override
	public void fly() {
		System.out.println("flyyyyyyyy");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stoppppppppppppppp");
	}
	
}
class Kites implements Flable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flllllllllllllllllllllllllly");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stoooooooooooooooooooooooopp");
	}
	
}
class Bullet implements Attack,Flable{

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("biubiubiu");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("biubiufllllllly");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("biubiustop");
	}
	
}