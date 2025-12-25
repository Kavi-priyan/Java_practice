package T;

public class Moonu {
	
	private static boolean psv(int[] arr) {

		
		int totalSum=0;
		
		
		for (int i : arr) {
			totalSum+=i;
		}
		
		
		if(totalSum%3!=0) {
			return false;
		}
		int count=0;
		
		int target=totalSum/3;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			if(sum==target) {
				count++;
				sum=0;
				
			}else if(count==2 && i < arr.length - 1) {
				return true;
			}
			
			
		}
		
		return false;
		

	}
public static void main(String[] args) {
	int[] arr= {1,2,3,0,3};
	System.out.println(psv(arr));
	;
	
	
	
}
}
