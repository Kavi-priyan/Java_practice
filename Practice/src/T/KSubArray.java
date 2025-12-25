package T;

public class KSubArray {
public static void main(String[] args) {
	int[] arr= {2,1,5,1,3,2};
	
	int k=3;
	
	int start=0;
	
	int end=start+k-1;
	int max=0;
	int currsum=0;
	
	
	while(end<arr.length) {
		
		currsum+=arr[start];
		
		
		
		max=Math.max(max, currsum);
		
		end++;
		
	}
}
}
