package Challenges;

import java.util.LinkedList;

public class Challenge3 {

	public static void main(String[] args) {

        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
	}

	private static boolean checkForPalindrome(String string) {

		LinkedList<Character> stack = new LinkedList<>();
		StringBuilder sb = new StringBuilder(string.length());
		String lowerCase = string.toLowerCase();
		
		for(int i=0;i<lowerCase.length();i++) {
			
			char c =lowerCase.charAt(i);
			if(c > 'a' && c< 'z') {
				
				stack.push(c);
				sb.append(c);
			}
			
		}
		StringBuilder sb1 = new StringBuilder(string.length());
		
		while(!stack.isEmpty()) {
			
			sb1.append(stack.pop());
		}
		
		
		
		return sb1.toString().equals(sb.toString());
	}

}
