package recursion;

public class Compress {
public static void main(String[] args) {
	String s="aabbccdde";
	
	
	int i=0;
	
	StringBuilder s1=new StringBuilder();
	
	while(i<s.length()) {
		
		int grouplength=1;
		
		while(i + grouplength<s.length() && s.charAt(i)==s.charAt(i+grouplength)) {
			grouplength++;
			
		}
		
		s1.append(s.charAt(i));
		s1.append(grouplength);
		
		
		i+=grouplength;
		
		
	}
	
	System.out.println(s1);
}
}
