package ListDS;

import java.util.List;
import java.util.Vector;

public class MainForVector {

	public static void main(String[] args) {

		List<Employee> employeeList = new Vector<>();
		
		employeeList.add(new Employee("jane","jones",12));
		employeeList.add(new Employee("jhon","Doe",123));
		employeeList.add(new Employee("gopal","mishra",324));
	}

}
