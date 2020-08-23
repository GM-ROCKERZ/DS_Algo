package BucketSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main2 {

	public static void main(String[] args) {
		

		LinkedList<Employee4> employee = new LinkedList<>();
		
		employee.add(new Employee4("Jane", "Jones", 123));
		employee.add(new Employee4("Jhon", "Doe", 5678));
		employee.add(new Employee4("Mike", "Wilson", 45));
		employee.add(new Employee4("Marry", "Smith", 5555));
		employee.addLast(new Employee4("Jhon", "Doe", 5678));
		employee.add(new Employee4("Bill", "End", 3948));
		employee.add(new Employee4("Jane", "Jones", 123));
		
		employee.forEach(e->System.out.println(e));
		
		HashMap<Integer,Employee4>  employeeTable= new HashMap();
		
		ListIterator<Employee4> iterator = employee.listIterator();
		
		List<Employee4> remove = new ArrayList<>();
		
		while(iterator.hasNext()) {
			Employee4 employees =iterator.next();
			
			if(employeeTable.containsKey(employees.getId())) {
				
				remove.add(employees);
				
			}
			else {
				
				employeeTable.put(employees.getId(),employees);
			}
			
		}
		
		
		for(Employee4 emp:remove) {
			
			employee.remove(emp);
			
			
		}
		
		System.out.println("-----------------");
		employee.forEach(e->System.out.println(e));
		
		
	}
	
	

}
