package edu.neu.csye6200;

public class Demo {
	public static void demo() {
		Stack q=new Stack(6);
		q.push(1);
		q.push(2);
		//q.pop();
		q.pop();
		q.push(3);
		q.push(9);
		System.out.println("top elements is:  " +q.peek());
		System.out.println("stack size is:    "+q.size());
		System.out.println(q.isFull());
		
		System.out.println("***************");
		Queue p=new Queue(7);
		p.enqueue(5);
		p.enqueue(1);
		p.enqueue(3);
		p.enqueue(7);
		System.out.println("front element is "+p.peek());
		System.out.println("queue size is "+p.size());
		System.out.println("*********888888888888888888888888**********");
		//Integer []i=new Integer[10];
	StackGeneric sg=new StackGeneric(7);
		//sg.push(7);
		sg.push(3);
		sg.pop();
		sg.push("oooo");
		
		System.out.println("top elements is:  " +sg.peek());
		System.out.println("queue size is "+sg.size());
		System.out.println("*******999999999999999999999999999*******");
		QueueGeneric qg=new QueueGeneric(6);
		qg.enqueue(7);
		qg.enqueue(9);
		qg.enqueue("k");
		System.out.println("front element is "+qg.peek());
		System.out.println("queue size is "+qg.size());
		
		
	}
}
