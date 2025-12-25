package Jun9;

public class Slate {

	public static void main(String[] args) {
		  int[] arr1 = {1, 10, 1, 1};
		  
		   int result = 0;

	        // Iterate over every bit position
	        for (int i = 0; i < 32; i++) {
	            int sum = 0;
	            int x = (1 << i); // Bit mask

	            for (int num : arr1) {
	                if ((num & x) != 0) {
	                    sum++;
	                    
	                    System.out.println(num);
	                }
	            }

	            // If sum % 3 is not 0, that bit is set in the unique number
	            if (sum % 3 != 0) {
	                result |= x;
	            }
	        }
	        
	       
	}

}
