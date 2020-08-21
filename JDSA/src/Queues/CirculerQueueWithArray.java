package Queues;

import Stacks.Employee1;

public class CirculerQueueWithArray {

	public static void main(String[] args) {

		Employee2 janeJones = new Employee2("Jane","Jones",123);
		Employee2 johnDoe = new Employee2("Jhon","Doe",4567);
		Employee2 marrySmith = new Employee2("Marry","Smith",22);
		Employee2 mikeWilson = new Employee2("Mike","Wilson",3245);
		Employee2 billEnd = new Employee2("Bill","End",78);
		
		CirculerQueue queue = new CirculerQueue(5);
	
		
		
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.remove();
		queue.add(marrySmith);
		queue.remove();
		queue.add(mikeWilson);
		queue.remove();
		queue.add(billEnd);
		queue.remove();
		queue.add(janeJones);
		
		queue.printQueue();
  
	/*	queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marrySmith);
		queue.add(mikeWilson);
		queue.add(billEnd);
		
		queue.printQueue();
		queue.remove();
		queue.remove();
		queue.peek();
		queue.printQueue()*/;

	}

}
