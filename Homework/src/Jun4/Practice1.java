package Jun4;

public class Practice1 {
	static void longestSubarray(int[] arr, int x) {
		  int start = 0, sum = 0;

	        for (int end = 0; end < arr.length; end++) {
	            sum += arr[end];

	            // Shrink window as long as sum is greater than x
	            while (sum > x && start < end) {
	                sum -= arr[start];
	                start++;
	            }

	            if (sum == x) {
	                System.out.print("Subarray with sum " + x + " found: ");
	                for (int i = start; i <= end; i++) {
	                    System.out.print(arr[i] + " ");
	                }
	                return;
	            }
	        }

	        System.out.println("No subarray with sum " + x + " found.");
}

public static void main(String[] args) {
    int[] arr = {10, 5, 2, 7, 1, -10};
    int k = 15;
   longestSubarray(arr, k);
}

}
