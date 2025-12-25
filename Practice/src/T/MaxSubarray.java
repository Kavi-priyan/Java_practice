package T;

public class MaxSubarray {
	
	public static boolean subarray(int[] arr) {

		int s=0;
		int e=1;

		int currsum=arr[0];
		int sum=0;
		while(e<=arr.length) {
			if(currsum==24) {
				return true;
			}
			while(currsum>sum && s<arr.length) {

				currsum+=arr[s];
				s++;
			}
			currsum+=arr[e];
			e++;
			
		}
		return false;
	}

	
	public static void main(String[] args) {
		int[] arr= {5,4,2,1,-8,5,3,5,7,1,2,3};
		
		
		
		
		
		
		
		System.out.println(subarray(arr));
	}
}
