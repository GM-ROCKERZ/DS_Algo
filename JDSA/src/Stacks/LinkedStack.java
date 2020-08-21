package Stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
	
	private LinkedList<Employee1> stack;
	
	public LinkedStack() {
		
		stack = new LinkedList<Employee1>();
		
	}
	
	public void push(Employee1 employee) {
		stack.push(employee);
		
	}
	
	public Employee1 pop() {
		
		return stack.pop();
	}
	public Employee1 peek() {
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		
		ListIterator<Employee1> iterator = stack.listIterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}
}
