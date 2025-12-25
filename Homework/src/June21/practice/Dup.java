package June21.practice;

import java.util.Iterator;

public class Dup {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5,5,6,6,6,7,8,8,8};
		int[] bottle=new int[arr.length];
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			boolean dup=false;
			
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==bottle[j]) {
					dup=true;
					break;
				}
				
			}
			
			if(!dup) {
				bottle[temp++]=arr[i];
				
			}
			
		}
		
		
		int[] arr1=new int[temp];
		
		for (int i = 0; i < temp; i++) {
			int j = bottle[i];
			arr1[i]=j;
			
			System.out.println(arr1[i]);
			
		}
	}

}
