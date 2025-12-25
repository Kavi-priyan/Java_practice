package recursion;

public class sum {

	public static int findTargetSumWays(int[] nums, int target) {
	    int sum = 0;
	    for (int num : nums) sum += num;

	    // 🚨 Guard clause to prevent negative array size
	    if (Math.abs(target) > sum || (target + sum) % 2 != 0) {
	        return 0;
	    }

	    int subsetSum = (target + sum) / 2;

	    int[] dp = new int[subsetSum + 1];
	    dp[0] = 1;

	    for (int num : nums) {
	        for (int j = subsetSum; j >= num; j--) {

	            System.out.println(dp[j]);

	            System.out.println(dp[j - num]);
	            dp[j] += dp[j - num];
	            System.out.println();
	            System.out.println("Loop end");
	        }
	    }

	    return dp[subsetSum];
	}
	
	   public static void main(String[] args) {
	        int[] nums = {1, 1, 1, 1, 1};
	        int target = 3;

	        int ways = findTargetSumWays(nums, target);
	        System.out.println("Number of ways: " + ways); // Output: 5
	    }

}
