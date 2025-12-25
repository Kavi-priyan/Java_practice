package recursion;

public class sorted {
	public static void main(String_skip[] args) {
		int[] nums= {11,2,3,4,5,6,7,8,9};
		
		boolean a=rec(nums,0);
		
		System.out.println(a);
		
		
		
	}
	
	private static boolean rec(int[] nums,int index) {
		
		if(index==nums.length-1) {
			return true;
		}
		return nums[index]<nums[index+1] && rec(nums,index+1);
		
	}

}
