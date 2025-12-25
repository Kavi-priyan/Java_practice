package July16;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
	                               
//	        System.out.print("Enter the lower bound of the range: ");
        int lower = 10;
//	        
//	        System.out.print("Enter the upper bound of the range: ");
      int upper = 20;
//	        
	        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
	       
	        Prime[] p=new Prime[upper-lower+1];
	        
	        
	        int l=0;
	        for(int i=lower;i<=upper;i++) {
	        	
	        	p[l++]=new Prime(i);
	        	
	        	
	        }
	        
	        
	        for (Prime prime : p) {
				
	        	prime.start();
			}
	        
	        scanner.close();
	}

}
