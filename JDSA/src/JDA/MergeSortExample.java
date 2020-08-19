package JDA;

public class MergeSortExample {

	
	public static void main(String[] args) {
		
		int[] intArray = {12,-23,45,62,-1,88,25,21};
		
		
		mergeWithRecursion(intArray, 0, intArray.length);
		
		
		for(int i=0 ;i<intArray.length;i++) {
			
			System.out.println(intArray[i]);
		}
	}
	
	//{12,-23,45,62,-1,88,25,21}
	
	public static void mergeWithRecursion(int[] input,int start,int end) {
		
		if((end-start)<2) {
			return;
		}
		
		int mid = (start+end)/2;
		mergeWithRecursion( input, start, mid);
		mergeWithRecursion(input,mid,end);
		merge(input,start,mid,end);
		
	}

	//{12,-23,45,62,-1,88,25,21}
	private static void merge(int[] input, int start, int mid, int end) {

		if(input[mid-1]<=input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int [] temp = new int[end-start];
		
		while(i<mid&& j<end) {
		
			temp[tempIndex++]= input[i]<=input[j]?input[i++]:input[j++];
		}
		System.arraycopy(input, i, input, start+tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
	
}
