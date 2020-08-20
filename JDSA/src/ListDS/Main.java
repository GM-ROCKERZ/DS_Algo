package ListDS;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("jane","jones",12));
		employeeList.add(new Employee("jhon","Doe",123));
		employeeList.add(new Employee("gopal","mishra",324));
		
/*		employeeList.forEach(employee ->System.out.println(employee));
		System.out.println(employeeList.get(1));
		System.out.println(employeeList.isEmpty());*/
		employeeList.set(1, new Employee("jhon","adams",4568));
//		System.out.println(employeeList.size());
		
		employeeList.add(3, new Employee("jhon","doe",4567));
//		employeeList.forEach(employee ->System.out.println(employee));
		
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		
		for(Employee employee:employeeArray) {
			
			System.out.println(employee);
			
		}
		
		/*System.out.println(employeeList.contains(new Employee("gopal","mishra",324)));
		
		System.out.println(employeeList.indexOf(new Employee("gopal","mishra",324)));*/
		
		employeeList.remove(3);
		
		employeeList.forEach(employee ->System.out.println(employee));

		
	}

}
