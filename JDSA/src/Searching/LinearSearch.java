package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] intArray = {20,30,-15,1,7,55,1,-22};
		
		System.out.println(linearSearching(intArray, -15));
		System.out.println(linearSearching(intArray, 30));
		System.out.println(linearSearching(intArray, 8));
		System.out.println(linearSearching(intArray, -22));
	}
	
	public static int linearSearching(int[] input,int value) {
		
		for(int i = 0;i<input.length;i++) {
			
			if(input[i]==value) {
				return i;
			}
			
			
		}
		
		return -1;
	} 
	
	

}
