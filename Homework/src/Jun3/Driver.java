package Jun3;


public class Driver {
public static void main(String[] args) {
	
	String s="Array";
	String s1=" ";
	s.toLowerCase();
	
	for (int i = s.length()-1; i >=0; i--) {
		char c=s.charAt(i);
		if(c=='a' || c=='e'|| c=='o'|| c=='u'|| c=='i') {
			System.out.println(i+ "th character is Vowel.");
		}else {
			System.out.println(i+ "th character is consonanats.");
		}
		s1=s1+c;
		
	}
	System.out.println(s);
	
}
}
