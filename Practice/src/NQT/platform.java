package NQT;

import java.util.Arrays;

public class platform {

	public platform() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		int[] dep= {910, 1200, 1120, 1130, 1900, 2000};
		int[] arr= {900, 940, 950, 1100, 1500, 1800};
		
		int platforms=1;
		int max_Platforms=1;
		
		
		Arrays.sort(arr);

		Arrays.sort(dep);
		
		int i=1;
		int j=0;
		
		while(i<arr.length && j<arr.length) {
			
			if(dep[j]>=arr[i]) {
				platforms++;
				
				max_Platforms=Math.max(max_Platforms, platforms);
				i++;
				
			}else{
				platforms--;
				j++;
			}
		}
		
		System.out.println(max_Platforms);
	}

}
