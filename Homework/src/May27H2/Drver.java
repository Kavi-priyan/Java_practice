package May27H2;

import java.util.Scanner;

public class Drver {
	  public static void main(String[] args) {
	        Cart cart = new Cart();
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Choose item to add:");
	            System.out.println("1. Electronics");
	            System.out.println("2. Clothing");
	            System.out.println("3. Groceries");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    cart.addItem(new Electronics());
	                    break;
	                case 2:
	                    cart.addItem(new Clothing());
	                    break;
	                case 3:
	                    cart.addItem(new Groceries());
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	                    i--;
	                    break;
	            }
	        }

	        System.out.println("\nItems in your cart:");
	        cart.displayCart();

	        sc.close();
	    }
}
