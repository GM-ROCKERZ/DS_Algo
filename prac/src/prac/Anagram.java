package prac;

import java.util.Arrays;

public class Anagram {

	public static boolean stringAnagram(String str,String str2) {
		
		char[] strArray1 =str.toCharArray();
		char[] strArray2 = str2.toCharArray();
		
		if(strArray1.length!=strArray2.length) {
			return false;
		}
		
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		
		for(int i=0;i<strArray1.length;i++) {
			
			if(strArray1[i]!=strArray2[i]){
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void main(String [] args) {
		
		if(stringAnagram("listen", "silend")) {
			
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}
}
