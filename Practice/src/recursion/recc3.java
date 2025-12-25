package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recc3 {
public static void main(String[] args) {
	 List<List<Integer>> result = new ArrayList<>();
     int[] nums= {1,3,4};
	Arrays.sort(nums);  // Sort to handle duplicates
     backtrack(nums, 0, new ArrayList<>(), result);
     System.out.println(result);
    
	
}

public static void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current)); // base case
    System.out.println(current);
    for (int i = index; i < nums.length; i++) {
    	System.out.print(i+" ");
    	System.out.println(index);
        current.add(nums[i]);                     // choose
        backtrack(nums, i + 1, current, result);  // explore

        System.out.println("________________________________________");// un-choose_
        current.remove(current.size() - 1);     
       
        
        
        System.out.println("..................................");// un-choose
    }
}

}
