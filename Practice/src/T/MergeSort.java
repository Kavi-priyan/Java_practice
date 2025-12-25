package T;

import java.util.Arrays;

public class MergeSort {
public static void main(String[] args) {
	
	int[] arr= {1,3,4,2,9,8};
	int[] arr1= {3,9,8,4,2,4};
	
	int[] arr2=new int[(arr.length+arr1.length)];
	
	int index=0;
	int i=0;
	int j=0;
	
	while(i<arr.length && j<arr1.length) {
		
		
		if(arr[i]>arr1[j]) {
			arr2[index++]=arr1[j++];
		}else {
			arr2[index++]=arr[i++];
		}
		
		
		while(j<arr1.length ) {
			
			
			
			arr2[index++]=arr1[j++];
		
	}

	while(i<arr.length ) {
			
			
			
				arr2[index++]=arr[i++];
			
		}
	}

	
	
	
//	
//	for(int i=0;i<m;i++) {
//		
//		
//		for(int a:arr) {
//			if(a<arr1[i]) {
//				arr2[index++]=a;
//			}
//		}
//		
//		
//		for(int a:arr1) {
//			if(a<arr[i]) {
//				arr2[index++]=a;
//			}
//		}
//	}

System.out.println(Arrays.toString(arr2));
}
}
