package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private Employee1[] stack;
	private int top;
	
	public ArrayStack(int capacity) {
		
		stack = new Employee1[capacity];
	}

	public void push(Employee1 employee) {
		if(top==stack.length) {
			//need to resize the backing array
			Employee1[] newArray = new Employee1[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[top++]=employee;
	}
	
	public void pop() {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
			Employee1 employee = stack[--top];
			stack[top] = null;
	}
	
	public Employee1  peek() {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return stack[top-1];
	}
	
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top==0;
	}
	
	public void printStack() {
		for(int i = top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
		
	}
	
}
