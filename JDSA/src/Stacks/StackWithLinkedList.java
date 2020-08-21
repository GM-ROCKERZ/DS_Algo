package Stacks;

import ListDS.Employee;

public class StackWithLinkedList {

	public static void main(String[] args) {
	
		Employee1 janeJones = new Employee1("Jane","Jones",123);
		Employee1 johnDoe = new Employee1("Jhon","Doe",4567);
		Employee1 marrySmith = new Employee1("Marry","Smith",22);
		Employee1 mikeWilson = new Employee1("Mike","Wilson",3245);
  
		LinkedStack stack = new LinkedStack();
		
		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marrySmith);
		stack.push(mikeWilson);
		
		
		//stack.printStack();
//		System.out.println(stack.peek());
//		stack.printStack();
		
		System.out.println("Popped :  "+stack.pop());
		System.out.println(stack.peek());
		
/*		stack.printStack();
		System.out.println(stack.peek());
		//stack.printStack();
		
		stack.pop();*/
		
		
		
	}

}
