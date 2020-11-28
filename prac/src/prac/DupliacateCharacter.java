package prac;

public class DupliacateCharacter {
	
	static final int NO_OF_CHAR=256;
	
	static void fillCharCount(String str,int[] count) {
		
		for(int i=0;i<str.length();i++) {
			
			count[str.charAt(i)]++;
		}
		
	
	}

	static void printDup(String str) {
		
		int count[] =new int[NO_OF_CHAR];
		
		fillCharCount(str,count);
		
		for(int i=0;i<NO_OF_CHAR;i++) {
			
			if(count[i]>0) {
				System.out.println((char)i+", count= "+count[i]);
			}
			//System.out.println((char)i+",count = "+count[i]);
		}
	}
	
	public static void main(String args[]) {
		
		String str ="teststring";
		printDup(str);
	}
}
