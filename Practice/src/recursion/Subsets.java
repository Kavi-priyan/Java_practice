package recursion;

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path)); // Add current subset

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);        
            System.out.println(path);// Choose

            System.out.println(nums[i]);
            backtrack(i + 1, nums, path, result);   
            ;
            
            System.out.println(path);// Choose
            path.remove(path.size() - 1);     
            System.out.println("loop end");// Un-choose (backtrack)
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        Subsets s = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = s.subsets(nums);

      
    }
}
