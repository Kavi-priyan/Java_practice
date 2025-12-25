package PGET;

public class palind {
	
	
	public static void main(String[] args) {
		String s = "aaa"; // Example input
        System.out.println(countSubstrings(s)); // Output: 6
	}

	private static int countSubstrings(String s) {
		// TODO Auto-generated method stub
		
		int count=0;
		  int n = s.length();
		for (int center= 0; center < 2*n-1; center++) {

			int left=center/2;
			int ryt=left+center%2;
			
			while(left>=0 && ryt<n && s.charAt(left)==s.charAt(ryt)) {
				count++;
				left--;
				ryt++;
				
			}
			
			
			
		}
		

        return count;
	}

}
