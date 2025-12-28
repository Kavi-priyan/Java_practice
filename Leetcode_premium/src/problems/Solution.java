package problems;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<Integer>> findLeaves(TreeNode root) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> stack =new ArrayList<>();
		
		if(root==null) {
			return stack;
		}
		
		level(root,stack);
		return stack;
	}

	private int level(TreeNode root, List<List<Integer>> stack) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return -1;
		}
		
		int level=Math.max(level(root.left,stack), level(root.ryt,stack))+1;
		
		
		if(stack.size()<=level) {
			stack.add(new ArrayList<>());
		}
		
		stack.get(level).add(root.val);
		
		return level;
		
		
		
	}

}
