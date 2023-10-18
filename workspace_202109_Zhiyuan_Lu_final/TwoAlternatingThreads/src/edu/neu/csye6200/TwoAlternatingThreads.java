package edu.neu.csye6200;

public class TwoAlternatingThreads implements Runnable{
	private int number=0;
	char upper='A';
	char lower='a';
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (this) {
				notify();
				if (number <= 25) {
					System.out.print( lower );
					System.out.print( upper );
					//System.out.println(Thread.currentThread().getName()+upper);
					//System.out.println(Thread.currentThread().getName()+lower);
					lower++;
					upper++;
					number++;
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} else {
					break;
				}
			}
		}
	}

}
