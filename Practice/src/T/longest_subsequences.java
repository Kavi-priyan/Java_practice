package T;

import java.util.*;

public class longest_subsequences {
    public static void main(String[] args) {
        String a = "SanKavi priy";
        String b = "Kavi priySan";
        Set<String> result = allLCS(a, b);
        
        System.out.println("All LCS subsequences:");
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static Set<String> allLCS(String a, String b) {
        int m = a.length();
        int n = b.length();

        // Step 1: Fill the DP table
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Step 2: Backtrack to find all LCS
        return backtrackAllLCS(a, b, m, n, dp);
    }

    private static Set<String> backtrackAllLCS(String a, String b, int i, int j, int[][] dp) {
        Set<String> result = new HashSet<>();

        if (i == 0 || j == 0) {
            result.add("");
            return result;
        }

        if (a.charAt(i - 1) == b.charAt(j - 1)) {
            for (String lcs : backtrackAllLCS(a, b, i - 1, j - 1, dp)) {
                result.add(lcs + a.charAt(i - 1));
            }
        } else {
            if (dp[i - 1][j] >= dp[i][j - 1])
                result.addAll(backtrackAllLCS(a, b, i - 1, j, dp));
            if (dp[i][j - 1] >= dp[i - 1][j])
                result.addAll(backtrackAllLCS(a, b, i, j - 1, dp));
        }

        return result;
    }
}
