package jun6;

public class subarray {
	public static void main(String[] args) {
		
		int[] arr= {-2,-4};
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr.length; j++) {
			int curr_max=0;
			for(int k=i;k<j;k++) {
				curr_max+=arr[k];
				
			}
			
			if(curr_max>max) {
				max=curr_max;
			}
			
			
		}
		
		
			
		}
		
		System.out.println(max);
	}

}
