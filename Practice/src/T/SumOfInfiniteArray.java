package T;
import java.util.*;

public class SumOfInfiniteArray {
    static final long MOD = 1000000007;

    // Helper function to calculate prefix sum in infinite array
    private static long prefixSum(long k, long[] prefixA, long totalSumA, int n) {
        if (k == 0) return 0;
        long fullRepeats = (k / n) % MOD;
        long remainder = k % n;
        long sum = (fullRepeats * (totalSumA % MOD)) % MOD;
        sum = (sum + prefixA[(int) remainder]) % MOD;
        return sum;
    }

    // Main logic function
    public static List<Long> sumInInfiniteArray(int[] A, long[][] queries) {
        int n = A.length;

        // Build prefix sum for A
        long[] prefixA = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixA[i] = (prefixA[i - 1] + A[i - 1]) % MOD;
        }

        long totalSumA = prefixA[n];

        // Answer queries
        List<Long> results = new ArrayList<>();
        for (long[] q : queries) {
            long L = q[0];
            long R = q[1];
            long ans = (prefixSum(R, prefixA, totalSumA, n)
                      - prefixSum(L - 1, prefixA, totalSumA, n) + MOD) % MOD;
            results.add(ans);
        }
        return results;
    }

    // Default test cases (no Scanner)
    public static void main(String[] args) {
        // Test Case 1
        int[] A1 = {1, 2, 3};
        long[][] queries1 = {{1, 3}, {1, 5}};
        System.out.println("Test 1: " + sumInInfiniteArray(A1, queries1)); // [6, 9]

        // Test Case 2
        int[] A2 = {5, 2, 6, 9};
        long[][] queries2 = {{1, 5}, {10, 13}, {7, 11}};
        System.out.println("Test 2: " + sumInInfiniteArray(A2, queries2)); // [27, 22, 28]

        // Test Case 3 (Large L, R)
        int[] A3 = {1, 2};
        long[][] queries3 = {{1, 1000000000000000000L}, {5, 10}};
        System.out.println("Test 3: " + sumInInfiniteArray(A3, queries3)); 
    }
}

