package recursion;


public class permutation {
	
	 private static void permute(String s, String result) {
	        if (s.isEmpty()) {  // Base case: When input is empty, print the result
	            System.out.println(result);
	            return;
	        }

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i); // Pick a character
	            String remaining = s.substring(0, i) + s.substring(i + 1); // Remove it

	            permute(remaining, result + ch); // Recursive call
	        }
	    }
	   private static void generateSubsequences(String s, String result) {
	      if (s.isEmpty()) {  
            if (!result.isEmpty()) {  // Avoid printing the empty string
                System.out.println(result);
            }
            return;
            
            
        }  // Exclude the first character
	        generateSubsequences(s.substring(1), result);
	        //bc

	        // Include the first character
	        generateSubsequences(s.substring(1), result + s.charAt(0));
	        //a
	        //b
	        //c
	        //

	      
	    }

	    public static void main(String[] args) {
	        String input = "abc";
	       permute(input, "");
	       // generateSubsequences(input, "");
	    }

}
