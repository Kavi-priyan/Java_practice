package T;

public class Prod {
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,-5,6};
		int max=arr[0];
		int currmax=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			int temp=currmax;
			
			currmax=Math.max(Math.max(currmax*arr[i], arr[i]), min * arr[i]);
			min=Math.min(Math.min(temp*arr[i], arr[i]), min * arr[i]);
			 max = Math.max(currmax,max);
		}
		
		System.out.println(max);
		
	}

}
