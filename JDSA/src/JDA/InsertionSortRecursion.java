package JDA;

public class InsertionSortRecursion {

	public static void main(String[] args) {


		int[] intArray = {20,35,-15,7,55,1,-22}; 

		insertionSort(intArray,intArray.length);


		for(int i =0;i<intArray.length;i++) {

			System.out.println(intArray[i]);

		}

	}
	public static void insertionSort(int[] input,int numOfItems) {


		if(numOfItems<2) {
			return;
		}

		insertionSort(input,numOfItems-1); 

		int newElement = input[numOfItems-1];

		int i;

		for(i=numOfItems-1;i>0&&input[i-1]>newElement;i--) {

			input[i]=input[i-1];

		}


		input[i]=newElement;

		System.out.println("Result of calls when no. of items ="+ numOfItems);
		for( i=0;i<input.length;i++) {
			System.out.println(input[i]);
			System.out.println(" , ");
		}


		System.out.println("");
		System.out.println("------------------");



	}

}
