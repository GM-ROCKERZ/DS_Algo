package prac;

public class StringReversal {

	private static void stringReversal(String str) {
		
		if(str.isEmpty()||str==null) {
			return;
		}
		
		char[] strArray =str.toCharArray();
		int i=0;
		int j=strArray.length-1;
		

		while(i<j) {
			
			swap(strArray,i,j);
			i++;
			j--;
		}
		for(char c:strArray) {
			
			System.out.print(c);
			//System.out.println();
		}
		
	}

	private static void swap(char[] strArray, int i, int j) {
	
		char temp=strArray[i];
		
		strArray[i]=strArray[j];
		strArray[j]=temp;
		
	}
	
	public static void main(String[] args) {
		
		String str = "Gopal Mishra";
		
		stringReversal(str);
		
		
	}
	
	
}
