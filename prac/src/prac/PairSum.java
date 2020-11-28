package prac;

import java.util.HashMap;

public class PairSum {
	
	static void printPairSum(int[]input,int n) {
		
		HashMap<Integer,Integer> map = new HashMap();
		
		for(int i =0;i<input.length;i++) {
			
			int rem =  n- input[i];
			if(map.containsKey(rem)) {
				
				System.out.println("pair is :"+rem+","+input[i]);
			}
			else if(map.containsKey(input[i])) {
				
				map.put(input[i], map.get(input[i])+1);
			}
			else {
				
				map.put(input[i], 1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		printPairSum(new int[]{1,3,2,4,5,3},6);
		
	}

}
