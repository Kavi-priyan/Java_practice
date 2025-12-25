package Jun4;

import java.util.Arrays;

public class alphasort {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		String[] arr= {"go","apple","ball","cat","dog","truck"};
		Arrays.sort(arr);
		
		int[] arr1=new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr1[i]=arr[i].length();
			
			System.out.println(arr1[i]);
			
			
		}
		
		String s="lello";
		s=s.replace('l', 'r');
		
		System.out.println(s);
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=null) {
				int len=arr[i].length();
				
				for (int j = i; j < arr.length; j++) {
					if( arr[j]!=null && (arr[j].length())==len) {
						System.out.print(arr[j]+" ");
						arr[j]=null;
						
					}
					
				}
				
				System.out.println();
				
			}
					
					
;
			
		}
		
		
		
	}

}
