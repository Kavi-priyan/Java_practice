package recursion;

public class String_skip {
	
	public static void main(String[] args) {
		String s="baccad";
		StringBuilder naan=new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='a') {
				
				return;
				
			}
			else {
				naan.append(s.charAt(i));
			}
			
		}
		System.out.println(naan);
	}

}
