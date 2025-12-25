package Jun4;

public class Srotate {
	//Sanji rotation
	
	public static void main(String[] args) {
		
		String s1="abcdefg";
		
		String s2="";
		
		int r=2;
		
		
		
		
		
		for(int i=r+1;i<s1.length();i++) {
			
			//cdefg
			
			s2=s2+ s1.charAt(i);
			
			
		
		}
		
		for (int i = 0; i < r; i++) {
			//cdefgab
			s2=s2+ s1.charAt(i);
			
		}
		
		System.out.println(s2);
	}

}
