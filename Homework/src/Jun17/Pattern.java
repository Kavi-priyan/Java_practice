package Jun17;

import java.util.Arrays;

public class Pattern {
	public static void main(String[] args) {
		String pattern="abba";
		String s="Legend is is Legend";
		
		boolean[] arr=new boolean[pattern.length()];

		boolean[] arr1=new boolean[pattern.length()];
		
		String[] sar=s.split(" ");
		
		int m=0;
		for (int i = 0; i < pattern.length() ; i++) {
			char a=pattern.charAt(i);
		
			for (int j = i+1; j < pattern.length(); j++) {
				if(a==pattern.charAt(j) && !sar[i].equals(sar[j])) {
			
					
					arr[j]=false;
				}
				else if(a!=pattern.charAt(j) && sar[i].equals(sar[j])){

			
					arr[j]=false;
				}
			}
			
arr[i]=true;
		
			
		}
		
//		for (int i = 0; i < pattern.length() ; i++) {
//			String a=sar[i];
//		
//			for (int j = i+1; j < pattern.length(); j++) {
//				if(a!=sar[j]) {
//			
//					
//					arr1[i]=false;
//					arr1[j]=true;
//				}else {
//					arr1[i]=true;
//					arr1[j]=true;
//				}
//				
//			}
//			
//
//		
//			
//		}
		
		
		
		
		
		
		System.out.println(Arrays.toString(sar));
	
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
