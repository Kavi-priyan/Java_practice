package June20;
import java.util.Scanner;

public class SecondHalf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number with even number of digits: ");
        String input = scanner.next();

       
        if (input.length() % 2 != 0) {
            System.out.println("Error: Number must have even number of digits.");
            return;
        }

        int product = 1;
        int half = input.length() / 2;

  
        for (int i = half; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            product *= digit;
        }

        System.out.println("Product of second half digits: " + product);
        scanner.close();
    }
}
