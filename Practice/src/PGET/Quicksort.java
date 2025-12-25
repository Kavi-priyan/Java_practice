package PGET;

import java.util.Arrays;

public class Quicksort {
	
	
	public static void main(String[] args) {
		int[] arr= {8,7,9,6,4,3,2,1,5};
		
		quicksort(arr,0,arr.length-1);
	
		System.out.println(	Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int start, int end) {
		
		if(end<=start) {
			return;
		}
		 int pivot=partion(arr,start,end);
		 quicksort(arr,start,pivot-1);
		 quicksort(arr,pivot+1,end);
		 
		
	}
	
	private static int partion(int[] arr, int start, int end) {
		int i=start-1;
		int pivot=arr[end];
		
		for(int j=start;j<end;j++) {
			
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		++i;
		int temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		
		return i;
		
		
		// TODO Auto-generated method stub
		
	
	}
}
