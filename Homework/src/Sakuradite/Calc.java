package Sakuradite;

import java.util.Scanner;

public class Calc {
	
	
	private static void div(double a,double b) {
		try {
			System.out.println(a/b);
			
		} catch (Exception e) {
			System.out.println();
			System.out.println(e.getMessage());
		
		}
		
		
		
	}
	
	
	
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	
	
	while(true) {
		
		System.out.println("Enter the numbers:");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		System.out.println("enter a choice: ");
		System.out.println("Option 1: div");
		
		int s=sc.nextInt();
		
		
		switch(s) {
		
		case 1:
			div(a,b);
			break;
			
		case 2:
			System.exit(0);
			

		default:
			System.out.println("Invalid");
		}
	
	
		
	}
	
	
		
	
}
}
