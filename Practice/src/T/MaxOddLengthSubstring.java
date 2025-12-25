package T;

import java.util.*;

public class MaxOddLengthSubstring {

    public static String maxOddLengthString(String s) {
        int n = s.length();
        List<String> substrings = new ArrayList<>();

        // Generate all substrings with odd length
        for (int i = 0; i < n; i++) {
            for (int len = 1; i + len <= n; len += 2) { // Only odd lengths
                substrings.add(s.substring(i, i + len));
            }
        }

        // Sort: prioritize longer length, then lexicographically larger
        substrings.sort((a, b) -> {
            if (a.length() == b.length()) {
                return b.compareTo(a); // Descending lexicographical
            }
            return Integer.compare(b.length(), a.length()); // Descending length
        });

        return substrings.isEmpty() ? "" : substrings.get(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(maxOddLengthString(input));
    }
}
