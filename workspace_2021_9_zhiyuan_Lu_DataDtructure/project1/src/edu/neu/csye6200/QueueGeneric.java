package edu.neu.csye6200;

public class QueueGeneric<T> {
	 T[] arr;
	 int capacity;
	 int front;
	 int rear;
	 int count;

	public QueueGeneric(int i) {
		arr=(T[])new Object[i];
		capacity=i;
		front=0;
		rear=-1;
		count=0;
	}
//	public StackGeneric(int i) {
//		arr=(T[])new Object[i];
//		capacity= i;
//		top=-1;
//	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return (size()==0);
	}
	public boolean isFull() {
		return(size()==capacity);
	}
	public void enqueue(T item) {
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
	public T peek() {
		if(isEmpty()) {
			System.exit(1);
		}return arr[front];
	}
}
