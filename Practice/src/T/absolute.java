package T;

public class absolute {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9};
	
	int sum=0;
	int k=5;
	
	int n= arr.length-1;
	
	for (int i =n ; i >=k ; i--) {
		
		int temp=arr[i-1];
		sum+=arr[i]-temp;
		
	}
	
	System.out.println(sum);
}
}
