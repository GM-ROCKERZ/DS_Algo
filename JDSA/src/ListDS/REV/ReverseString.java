package ListDS.REV;

public class ReverseString {

	public static void main(String[] args) {

		String input = "gopal mishra";
		
		char[] temp = input.toCharArray();
		
		int left=0;
		int right =temp.length-1;
		
		for(left=0;left<right;left++,right--) {
			
	           char tempElement = temp[left];
	            temp[left] = temp[right];
	            temp[right] = tempElement;
		}
		
		   for (char c : temp)
	            System.out.print(c);
	        System.out.println();
	}

}
