package edu.neu.csye6200;

public class Queue {
	 int[] arr;
	 int capacity;
	 int front;
	 int rear;
	 int count;

	public Queue(int size) {
		arr=new int[size];
		capacity=size;
		front=0;
		rear=-1;
		count=0;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return (size()==0);
	}
	public boolean isFull() {
		return(size()==capacity);
	}
	public void enqueue(int item) {
		if(isFull()) {
			System.exit(1);
			}
		System.out.println("Adding"+item);
		rear=(rear+1)%capacity;
		arr[rear]=item;
		count++;
	}
	public void dequeue() {
		if(isEmpty()) {
			System.exit(1);
		}
		System.out.println("removing"+arr[front]);
		front=(front+1)%capacity;
		count--;
		}
	public int peek() {
		if(isEmpty()) {
			System.exit(1);
		}return arr[front];
	}
	
	
	
}
