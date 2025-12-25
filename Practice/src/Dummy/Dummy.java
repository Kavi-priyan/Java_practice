package Dummy;

import java.util.Arrays;

public class Dummy {
public static void main(String[] args) {
	int[][] arr= {{1,2},{2,3},{3,4},{1,3}    };
	Arrays.sort(arr,(a,b)->Integer.compare(a[1], b[1]));
	
	System.out.println(Arrays.deepToString(arr));
	
//	
//	for (int[] is : arr) {
//
//		
//		for (int is2 : is) {
//			System.out.print(is2+" ");
//			
//		}
//		
//		System.out.println();
//	}
}
}
