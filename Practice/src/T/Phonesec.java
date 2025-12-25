package T;

public class Phonesec {
	
	public static void main(String[] args) {
		int 
	}
	public static char slowestKey(int[] releaseTimes,String keyPressed) {
		
		
		int max=releaseTimes[0];
		char ans =keyPressed.charAt(0);
		
		for(int i=1;i<releaseTimes.length;i++) {
			int duration=releaseTimes[i]+releaseTimes[i-1];
			
			char key=keyPressed.charAt(i);
			
			if(duration >max || (duration ==max && key >ans)) {
				
				max=duration;
				ans=key;
				
			}
			
		}
		
		return ans;
		
	}

}



