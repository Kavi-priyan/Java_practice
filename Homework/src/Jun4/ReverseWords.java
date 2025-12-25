package Jun4;

import java.util.Scanner;

public class ReverseWords {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        
        String[] words = input.split("\\s+");
        
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) System.out.print(" ");
        }
    }
    
    
}

