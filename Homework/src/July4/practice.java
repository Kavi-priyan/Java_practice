package July4;

public class practice {
	
	public static String sum(String s) {
		return s;
		
		
		
		
	}

	
	public static void main(String[] args) {
		String num="241";
		
		int max=-1;
		
		for(int i=num.length()-1;i>=0;i--) {
			
			char c=num.charAt(i);
			int c1=c;
			
			
			if( Character.isDigit(c)  && c%2!=0) {
				
				max=i;
				break;
				
				
			}else if(c%2==0) {
				continue;
			}
		
			
			
			
		}
		
		System.out.println(num.substring(0,max+1));
	}
}
