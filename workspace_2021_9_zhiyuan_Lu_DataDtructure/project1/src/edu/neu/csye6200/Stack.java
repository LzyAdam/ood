package edu.neu.csye6200;

public class Stack {
	//int size;
	//boolean isEmpty;
	//boolean isFull;
	 int[] arr;
	 int capacity;
	 int top;
	//Push
	//Pop
	int peek;
	public Stack(int size) {
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return(top==capacity-1);
	}
	public void push(int item) {
		if(isFull()) {
			System.exit(1);//error
		}
		System.out.println("inserting"+item);
		arr[++top]=item;
		
	}
	public int pop() {
		if(isEmpty()) {
			System.exit(1);
		}
		System.out.println("Removing"+peek());
		return arr[top--];
		
	}
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.exit(1);
		}
		return -1;
	}
	

}
