package prac;

import java.util.HashMap;

public class SubArraySum {
	
	public static int subarraySum(int [] input,int k) {
		
		if(input.length==0) {
			return 0;
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int sum=0;
		int count=0;
		
		for(int i=0;i<input.length;i++) {
			
			sum+=input[i];
			
			if(sum==k) {
				count++;
			}
			if(map.containsKey(sum-k)) {
				
				count+=map.get(sum-k);
			
				map.put(sum,map.getOrDefault(sum, 0)+1);
			}
			
			
		}
		
	
		return count;
	}
	
	public static void main(String[] args) {
		
		int n = subarraySum(new int[] {1,2,3}, 3);
		System.out.println(n);
	}

}
