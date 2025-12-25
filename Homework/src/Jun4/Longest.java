package Jun4;
import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        String[] words = input.split("\\s+"); 
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}
