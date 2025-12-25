package PGET;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangle {
	
	public static void main(String[] args) {
	     char[][] arr = {
	             {'1','0','1','0','0'},
	             {'1','0','1','1','1'},
	             {'1','1','1','1','1'},
	             {'1','0','0','1','0'}
	         };		
	     
	     
	     
	     
		int[] heights=new int[arr[0].length];
		int max=0;
		
		for(char[] arr1:arr) {
			for(int i=0;i<arr1.length;i++) {
				heights[i]=arr1[i]=='1'? heights[i]+1:0;
				
			
				
			}
			max= Math.max(max, area(heights));
		}
		
		System.out.println(max);
	}

	private static int area(int[] heights) {
		// TODO Auto-generated method stub
		int[] newHieghts=Arrays.copyOf(heights, heights.length+1);
		
		Stack<Integer> stack=new Stack<>();
		int max=0;
		
		for(int i=0;i<newHieghts.length;i++) {
			
			while(!stack.isEmpty() && newHieghts[i]<newHieghts[stack.peek()]  ) {
				
				int height=newHieghts[stack.pop()];
				int weight=stack.isEmpty()?i:i-stack.peek()-1;
				max=Math.max(max,height*weight);
				
			}
			
			stack.push(i);
			
		}
		
		
		return max;
	}

}
