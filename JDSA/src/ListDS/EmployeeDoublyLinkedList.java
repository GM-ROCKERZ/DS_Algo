package ListDS;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);


		if(head==null) {
			tail=node;
		}
		else {
			head.setPrev(node);
			node.setNext(head);
		}
		head = node;
		size++;
	}

	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(tail==null) {

			head=node;
		}
		else {
			tail.setNext(node);
			node.setPrev(tail);
		}

		tail=node;
		size++;


	}


	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head==null;
	}

	public EmployeeNode removeFromFront() {

		if(isEmpty()) {
			return null;
		}

		EmployeeNode removeNode=head;

		if(head.getNext()==null) {
			tail=null;
		}
		else {
			head.getNext().setPrev(null);
		}

		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;



	}

	public EmployeeNode removefromEnd() {

		if(isEmpty()) {
			return null;
		}

		EmployeeNode removeNode=tail;

		if(tail.getPrev()==null) {
			head=null;
		}

		else {
			tail.getPrev().setNext(null);
		}
		tail=tail.getPrev();
		size--;
		removeNode.setPrev(null);
		return removeNode;

	}


	public void printList() {

		EmployeeNode current = head;
		System.out.println("Head ->");
		while(current!=null) {
			System.out.println(current);
			System.out.println("<->");
			current = current.getNext();
		}
		System.out.println("null");
	}


}
