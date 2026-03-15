package NQT;

import java.util.*;

public class nextGreat {

	public nextGreat() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
	
		int[] arr= {4,5,2,44,2,25};
		int n=arr.length;
		
	
		
		int[] res=new int[n];
		
		for(int i= n-1;i>=0;i--) {
			
			while(!stack.isEmpty() && stack.peek()<=arr[i] ) {
				stack.pop();
			}
			
			res[i]=stack.isEmpty()?-1:stack.peek();
			
			
			
			stack.push(arr[i]);
			
		}
	
		
		System.out.println(Arrays.toString(res));
		
	}

}
