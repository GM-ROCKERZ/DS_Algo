package prac;

import java.util.HashMap;

public class EachCharCountInString {
	
	static void charCount(String str) {
		
		HashMap<Character,Integer> count = new HashMap();
		
		str= str.toLowerCase();
		str=str.replaceAll("\\s", "");
		
		char[] strArray = str.toCharArray();
		
		for(char c:strArray) {
			
			if(count.containsKey(c)) {
				
				count.put(c, count.get(c)+1);
			}
			else {
				
				count.put(c, 1);
			}
		}
		System.out.println(str+","+count);
	}
	
	public static void main(String args[]) {
		
		charCount("Java J2EE Java JSP J2EE");
		charCount("All Is Well");
	}

}
