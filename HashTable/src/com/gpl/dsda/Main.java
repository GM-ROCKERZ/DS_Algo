package com.gpl.dsda;

public class Main {

	public static void main(String[] args) {
		
		
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee jhonDoe = new Employee("Jhon","Doe",4567);
		Employee marrySmith = new Employee("Marry","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		//Employee billEnd = new Employee("Bill","End",78);
		
		SimpleHashtable ht = new SimpleHashtable();
		ht.put("Jones",janeJones);
		ht.put("Doe", jhonDoe);
		ht.put("Smith" ,marrySmith);
		ht.put("Wilson" ,mikeWilson);
		//ht.put("End" ,billEnd);
		
		//ht.printHashTable();
		
	   System.out.println("Retrive key Wilson  " +ht.get("Jones"));
	   System.out.println("Retrive key Wilson  " +ht.get("Smith"));
		
		
		ht.remove("Wilson");
		ht.remove("Jones");
		ht.printHashTable();
	System.out.println("Retrive key Wilson  " +ht.get("Smith"));
		
		
		
	}

}
