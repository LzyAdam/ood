package edu.neu.csye6200;

public class Demo {
	public static void demo() {
		 TwoAlternatingThreads t = new TwoAlternatingThreads();
		Thread t1 = new Thread( t);
		Thread t2 = new Thread( t);
		
		
		t1.start();
		
		
		t2.start();
		
	}
}
