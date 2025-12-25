package T;

import java.util.Arrays;

public class Matrix {
	
	
	
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int n=3;
		int m=3;
		
		
		int[][] arr1=new int[3][3];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				
				if(i%2!=0) {
					arr1[i][j]=arr[i][m-j-1];
				}else {
					arr1[i][j]=arr[i][j];
					
				}
			}
		}
		
		for (int[] row : arr1) {
		    System.out.println(Arrays.toString(row));
		}
		
		
	}

}
