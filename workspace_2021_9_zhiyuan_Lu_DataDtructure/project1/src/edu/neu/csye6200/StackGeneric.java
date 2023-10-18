package edu.neu.csye6200;

public class StackGeneric<T> {
	int size;
	Boolean isEmpty;
	Boolean isFull;
	 T arr[];
	 Integer capacity;
	 Integer top;
	//Push
	//Pop
	//int peek;
	public StackGeneric(int i) {
		arr=(T[])new Object[i];
		capacity= i;
		top=-1;
	}
	/*
	 * public Stack(int size) {
		array = (T[]) new Object[size];
		capacity = size;
		top = -1;
	}
	 */
//	public StackGeneric(int i) {
//		// TODO Auto-generated constructor stub
//	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return(top==capacity-1);
	}
	public void push(T item) {
		if(isFull()) {
			System.exit(1);//error
		}
		System.out.println("inserting"+item);
		arr[++top]=item;
		
	}
	/*
	 * 
	 * * public void push(T item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Inserting " + item);
		array[++top] = item;
	}
	 */
	public T pop() {
		if(isEmpty()) {
			System.out.println("error pop");
			System.exit(1);
			
		}
		System.out.println("Removing"+peek());
		arr[top]=null;
		return  arr[top--];
		
	}
	/*	 public T pop() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		System.out.println("Removing " + peek());
		array[top] = null;
		return array[top--];
	}
	 * 
	 * 
	 */
	
	public T peek() {
		if(!isEmpty()) {
			return  arr[top];
		}else {
			System.out.println("error peek");
			System.exit(1);
			
		}
		//return arr[top];
		return arr[top];
	}
	

}
