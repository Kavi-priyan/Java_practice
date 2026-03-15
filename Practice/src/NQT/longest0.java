package NQT;

import java.util.HashMap;
import java.util.Map;

public class longest0 {

	public longest0() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,1,1,0};
		
		
		
		int len=0;
		
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, -1);
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				sum-=1;
			}else{
				sum++;
			}
			
			if(map.containsKey(sum)) {
				
				len=Math.max(len, i-map.get(sum));
			}else {
				map.put(sum, i);
			}
			
			
			
			
			
		
			
			
		}
		System.out.println(len);
	}

}
