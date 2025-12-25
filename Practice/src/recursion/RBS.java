package recursion;


// catch the sun


public class RBS {
	public static void main(String_skip[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		
		System.out.println(rbs(arr,5,0,arr.length-1));
		
	}
	
	
	static int rbs(int[] arr,int key,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		
		if(arr[mid]==key) {
			return mid;
		}
		
		if(arr[start]<=arr[mid]) {
			if(key>=arr[start] && key<=arr[mid]) {
				end=mid+1;
				
			}
			else {
				start=mid-1;
			}
		}
			
		if(key<=arr[end] && key>=arr[mid]) {
				start=mid-1;
			}
			else {
				end=mid+1;
				
			}
		
		
		
		
	return mid;
		
		
	}

}
