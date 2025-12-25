package June20;
import java.util.Arrays;

public class NonNegative {

    public static int[] processArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] - nums[i + 1] < 0) {
             
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        int[] result = processArray(nums);
        System.out.println("Modified array: " + Arrays.toString(result));
    }
}
