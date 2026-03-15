package NQT;

import java.util.HashSet;
import java.util.Set;

public class repeat {

	public repeat() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String s="kkfaabbcddee";
		
		int[] chars=new int[27];
		
		for(char c:s.toCharArray()) {
			
			chars[c-'a']++;
		}
		
		for(char c:s.toCharArray()) {
			
			if(chars[c-'a']==1) {
				
				System.out.println(c);
				break;
				
			}
		}
	}

}
