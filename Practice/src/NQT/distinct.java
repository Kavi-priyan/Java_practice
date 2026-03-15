package NQT;

import java.util.Scanner;

public class distinct {

	public distinct() {
		// TODO Auto-generated constructor stub
	}
	
	public static void distinctKMaximumSum(int[] arr,int k) {
		
		
		int[] freq=new int[10000001];
		
		int left=0;
		int sum=0;
		int maxSum=0;
		int distinct=0;
		
		
		for(int ryt=0;ryt< arr.length;ryt++) {
			
			
			int num=arr[ryt];
			sum+=num;
			if(freq[num]==0) {
				distinct++;
			}
			
			freq[num]++;
			
			
			
			while(distinct>k) {
				
				sum-=arr[left];
				
				freq[arr[left]]--;
				
				if(freq[arr[left]]==0) {
					distinct--;
				}
				
				left++;
				
				
			}
			
			
			if(distinct==k) {
				maxSum=Math.max(maxSum, sum);
			}
			
			
		}
		
		System.out.println("Maximum sum of subarray k of distinct elements: "+maxSum);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the n: ");
		int n=sc.nextInt();
		System.out.println("Enter the k: ");
		int k=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the numbers : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		distinctKMaximumSum( arr, k);
		
//		int maxSum=-1;
//		
//		int dummy=k;
//		
//		for(int i=1;i<n;i++) {
//			
//			int current=0;
//			
//			current+=arr[i];
//			
//			if(arr[i]!=arr[i-1]) {
//				k--;
//			}
//			
//			if(k<=0) {
//				maxSum=current;
//				k++;
//			}
//			
//			
//			maxSum=Math.max(maxSum, maxSum+current);
//			
//		}
//		
//		System.out.println(maxSum+1);
	}

}
