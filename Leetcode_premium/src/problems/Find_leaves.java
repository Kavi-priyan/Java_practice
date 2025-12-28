package problems;

import java.util.List;

class TreeNode{
	TreeNode left;
	TreeNode ryt;
	int val;
	
	TreeNode(){}
	
	TreeNode(int val){
		this.val=val;

	}
	
	
	TreeNode(int val,TreeNode left,TreeNode ryt){
		this.val=val;
		this.left=left;
		this.ryt=ryt;
	}
}

public class Find_leaves {
	
	public static void main(String[] args) {
		 // Creating the tree:
        //         1
        //        / \
        //       2   3
        //      / \    
        //     4   5  
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.ryt = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.ryt = new TreeNode(5);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.findLeaves(root);

        // Print output
        System.out.println(result);
	}

}
