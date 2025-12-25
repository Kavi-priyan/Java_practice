package T;

public class Find_the_celebrity extends Relation{

	Find_the_celebrity(boolean[][] matrix) {
		super(matrix);
		// TODO Auto-generated constructor stub
	}
	
	
	public  int findCelebrity(int n) {
		
		int candidate=0;
		
		
		
		for(int p=1;p<n;p++) {
			
			if(knows(candidate,p)) {
				candidate=p;
				
			}
			
		}
		

		for(int p=0;p<n;p++) {
			if(p==candidate)continue; 
			if(knows(candidate,p) || !knows(p,candidate)) {
				return -1;
				
			}
			
		}
		return candidate;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		  boolean[][] matrix = {
		            {false, true,  true},
		            {false, false, true},
		            {false, false, false}
		        };

		        Find_the_celebrity sol = new Find_the_celebrity(matrix);
		        int result = sol.findCelebrity(3);
		        System.out.println("Celebrity is: " + result);
	}

}
