package T;

import java.util.PriorityQueue;

public class Subarray {
	
	public static void main(String[] args) {
		int[] arr= {0,3,-1,2};
		
		PriorityQueue<Integer> p=new PriorityQueue();
		
		for(int i:arr) {
			p.offer(i);
		}
		
		
		for(int i=0;i<3;i++) {
			
			int min= p.poll();
			
		
			min=-min;	p.offer(min);
			
		}
		int sum=0;
		
		for(int a:p) {
			
			sum+=a;
			
		}
		
		System.out.println(sum);
	}

}
