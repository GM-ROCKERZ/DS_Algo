package ListDS;

import java.util.Iterator;
import java.util.LinkedList;

public class JdkLinkedList {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDoe = new Employee("Jhon","Doe",4567);
		Employee marrySmith = new Employee("Marry","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		Employee billEnd = new Employee("Bill","End",72);
		
		
		LinkedList<Employee> list = new LinkedList();
		
		list.addFirst(janeJones);
		list.addFirst(johnDoe);
		list.addFirst(marrySmith);
		list.addFirst(mikeWilson);
		list.addLast(billEnd);
		list.removeFirst();
		Iterator iter = list.iterator();

		System.out.println("Head ->");
		while(iter.hasNext()) {
			System.out.println(iter.next());
			System.out.println("<->");
		}
		System.out.println("null");
	}

}
