package com.gpl.dsda;

import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee jhonDoe = new Employee("Jhon","Doe",4567);
		Employee marrySmith = new Employee("Marry","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		
		Map<String, Employee> hashMap = new HashMap();
		
		hashMap.put("Jones",janeJones);
		hashMap.put("Doe",jhonDoe);
		hashMap.put("Smith",marrySmith);
		//hashMap.put("Wilson",mikeWilson);
		Employee employee =hashMap.put("Doe",mikeWilson);
		//System.out.println(employee);
		
		System.out.println(hashMap.containsKey("Doe"));
		System.out.println(hashMap.containsValue(janeJones));
		
//		Iterator<Employee> iterator = hashMap.values().iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
		hashMap.forEach((k,v)->System.out.println("key "+ k +",Employee="+v));
		

	}

}
