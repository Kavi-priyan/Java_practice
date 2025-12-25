package Patterns;

public class Number {

	public static void main(String[] args) {
	
		        int num = 1;
		        int rows = 5; // Number of rows in the pyramid

		        for (int i = 1; i <= rows; i++) {
		            // Print i numbers in the ith row
		            for (int j = 1; j <= i; j++) {
		                System.out.print(num + " ");
		                num++;
		            }
		            System.out.println(); // Move to next line after each row
		        }
		    }
		

	}

