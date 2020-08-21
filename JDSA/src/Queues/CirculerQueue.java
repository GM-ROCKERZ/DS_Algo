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
		
		if(back == queue.length) {
			
			Employee2[] newArray = new Employee2[2*queue.length]; 
			
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			
			queue = newArray;
		}
		
		queue[back] = employee;
		back++;
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
		
		return employee;
		
	}
	
	
	public Employee2 peek() {
		if(size()==0) {
			
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	public int size() {
		return back-front;
	}
	
	public void printQueue() {
		
		for(int i = front;i<back;i++) {
			System.out.println(queue[i]);
		}
	}
	
	
	

}
