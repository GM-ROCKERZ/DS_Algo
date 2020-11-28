package prac;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates {
	
	public static void duplicateString(String str) {
		
		str= str.toLowerCase();
		
		str =str.replace("\\s","");
		
		char[] strArray = str.toCharArray();
		
		HashMap<Character,Integer> map =new HashMap<>();
		
		for(int i=0;i<strArray.length;i++) {
			
			if(map.containsKey(strArray[i])) {
				
				map.put(strArray[i], map.get(strArray[i])+1);
				
			}
			else {
				
				map.put(strArray[i],1);
			}
		}
		
		
		Set<Entry<Character,Integer>> entry = map.entrySet();
		
		for(Entry <Character,Integer> character:entry) {
			
			if(character.getValue()>1) {
				
				System.out.printf("%s :%d\n",character.getKey(),character.getValue());
				
			
			}
			
		}
	
	}
	
	public static void main(String[] args) {
		
		duplicateString("programming is funn");
	}

}
