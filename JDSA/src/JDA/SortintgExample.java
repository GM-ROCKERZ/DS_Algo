package JDA;

public class SortintgExample {

	public static void main(String[] args) {
		
		
		int[] intArray = {20,34,-22,12,1,1,0,21,32};
		
//	
//		for(int lastIndex=intArray.length-1;lastIndex>0;lastIndex--) {
//			
//			int largest =0;
//			for(int i=1;i<=lastIndex;i++) {
//				
//				if(intArray[i]>intArray[largest]) {
//					largest=i;
//					
//				}
//			}
//			swap(intArray,largest,lastIndex);
//		}
//		
		
		//Insertion sort
		
//		for(int firstindex=1;firstindex<intArray.length;firstindex++) {
//			int newElement =intArray[firstindex];
//			int i;
//			
//			for( i = firstindex;i>0 && intArray[i-1]>newElement;i--) {
//				
//				intArray[i]=intArray[i-1];
//			}
//			
//			intArray[i]=newElement;
//			
//		}
//		
		
		//shell sort
		
		for(int gap =intArray.length/2;gap>0;gap/=2) {
			
			for(int i=gap;i<intArray.length;i++) {
				
				int newElement = intArray[i];
				
				int j=i;
				
				
				while(j>=gap&&intArray[j-gap]>newElement){
				
					intArray[i]=intArray[j-gap];
					j-=gap;
				}
				
				intArray[j]=newElement;
			}
		}
		
		
		
	for (int i : intArray) {
		System.out.println(i);
		
	}
	}

//	private static void swap(int arr[],int i, int j) {
//		if(i==j) {
//			return;
//		}
//		
//			
//			int temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//			
//		
//	}

}
