package ListDS;

public class Challenge1 {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDoe = new Employee("Jhon","Doe",4567);
		Employee marrySmith = new Employee("Marry","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		Employee billEnd = new Employee("Bill","End",78);
		
		
		LinkedListChallenge1 list = new LinkedListChallenge1();
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		
		list.addBefore(billEnd, johnDoe);
		list.printList();
		
		list.addBefore(new Employee("Somone","Else",111), mikeWilson);
		list.printList();
		
	}

}
