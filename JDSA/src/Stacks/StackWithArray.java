package Stacks;

public class StackWithArray {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(10);
		
		stack.push(new Employee1("Jane","Jones",123));
		stack.push(new Employee1("John","Doe",4567));
		stack.push(new Employee1("Marry","Smith",22));
		stack.push(new Employee1("Mike","Wilson",3245));
		stack.push(new Employee1("Bill","End",78));
		
		stack.printStack();
		System.out.println(stack.peek());
		//stack.printStack();
		
		stack.pop();
	}

}
