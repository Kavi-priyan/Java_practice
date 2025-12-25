package T;

public class Kadane {
public static void main(String[] args) {
	int max=Integer.MIN_VALUE;
	int curr_max=0;
	int start=0;
	int end=0;
	int[] arr= {9,7,-2,3,4,-9,-8};
	
	for(int i=0;i<arr.length;i++) {
		curr_max+=arr[i];
		
		if(max<curr_max) {
			max=curr_max;
		}
		// 
		if(curr_max<0) {
			curr_max=0;
		}
		
	}
	
	System.out.println("No of elements: "+smallestSubWithSum(arr) );
	
	System.out.println("Max sum: "+max);
	
	array(arr);
  }

public static int smallestSubWithSum( int[] arr) {
  int min=Integer.MIN_VALUE;

  
  for(int i=0;i<arr.length;i++){
      int sum=0;
      for(int j=i;j<arr.length;j++){
          sum+=arr[j];
          
          if(sum>min){
              min=Math.max(min,j-i+1);
                       break;
          }
          
      }
  }
          if (min == Integer.MIN_VALUE) return 0;
  return min;
}



public static void array(int[] arr) {
	int start=0;
	int end=0;
	int temp=0;

	int max=Integer.MIN_VALUE;
	
	
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		
		
		
		sum+=arr[i];
		
		if(sum>max) {
			max=sum;
			start=temp;
			end=i
				;
		}else if(sum<0) {
			sum=0;
			temp=i+1;
		}
		
		
		
		
	}
	
	if (max <= 0) {
        System.out.println("No subarray with positive sum found.");
        return;
    }

    System.out.print("Maximum positive sum subarray: [");
    for (int i = start; i <= end; i++) {
        System.out.print(arr[i]);
        if (i < end) System.out.print(", ");
    }
    System.out.println("]");
 
	
	
}
}
