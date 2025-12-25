package June20;

import java.util.Scanner;

public class TemperatureCheck {

    
    public static boolean hasSignificantlyHotterDay(int[] temperatures) {
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] - temperatures[i - 1] >= 5) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = new int[7];

        System.out.println("Enter the high temperatures for the week (7 days):");
        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }

        boolean result = hasSignificantlyHotterDay(temperatures);
        if (result) {
            System.out.println("Yes, there was at least one significantly hotter day.");
        } else {
            System.out.println("No significantly hotter days were recorded.");
        }

        scanner.close();
    }
}
