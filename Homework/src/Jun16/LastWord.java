package Jun16;

import java.util.Scanner;

@SuppressWarnings("unused")
public class LastWord {
	  public static int lengthOfLastWord(String s) {
	        int length = 0;
	        int i = s.length() - 1;

	        
	        while (i >= 0 && s.charAt(i) == ' ') {
	            i--;
	        }

	        while (i >= 0 && s.charAt(i) != ' ') {
	            length++;
	            i--;
	        }

	        return length;
	    }

	   public static void main(String[] args) {
	

	        String input = "Kumachi >>> Barthomaleo Kuma    ";

	        int result = lengthOfLastWord(input);
	        System.out.println("Length of the last word: " + result);
	}

}
