package Queues;

import java.util.NoSuchElementException;

public class CirculerQueue {
	
	private Employee2[] queue;
	private int front;
	private int back;
	
	public CirculerQueue(int capacity) {
		
		queue= new Employee2[capacity];
	}
	
	public void add(Employee2 employee) {
		
		if(size() == queue.length-1) {
			
			int numOfItems = size();
			Employee2[] newArray = new Employee2[2*queue.length]; 
			
		
			System.arraycopy(queue, front, newArray, 0, queue.length-front);
			System.arraycopy(queue, 0, newArray, queue.length-front, back);
			
			queue = newArray;
			
			front = 0;
			back =numOfItems;
		}
		
		queue[back] = employee;
		if(back < queue.length-1) {
			back++;
		}
		else {
			back=0;
		}
		
	}
	
	public Employee2 remove() {
		if(size()==0) {
			
			throw new NoSuchElementException();
		}
		Employee2 employee = queue[front];
		queue[front] = null;
		front++;
		if(size()==0) {
			front =0;
			back = 0;
		}
		else if(front == queue.length){

			front=0;
		}
		return employee;
		
	}
	
	
	public Employee2 peek() {
		if(size()==0) {
			
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	public int size() {
	
		if(front<=back) {
			return back-front;
		}
		else {
			return back-front+queue.length;
		}
	}
	
	public void printQueue() {
		if(front<=back) {
		
		for(int i = front;i<back;i++) {
			System.out.println(queue[i]);
		}
	}
	
	else {
		
		for(int i =front;i<queue.length;i++) {
			System.out.println(queue[i]);
		}
		
		for(int i =0;i < back;i++) {
			System.out.println(queue[i]);
		}
	}
	
	}

}
