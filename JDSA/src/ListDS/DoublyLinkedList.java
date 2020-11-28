package ListDS;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDoe = new Employee("Jhon","Doe",4567);
		Employee marrySmith = new Employee("Marry","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println(list.getSize());
		
//		
//		
//		Employee billEnd = new Employee("Bill","End",78);
//		list.addToEnd(billEnd);
//		list.printList();
//		System.out.println(list.getSize());
//		
//		list.removeFromFront();
//		list.printList();
//		System.out.println(list.getSize());
//		
//		
//		list.removefromEnd();
//		list.printList();
//		System.out.println(list.getSize());
		
	}

}
