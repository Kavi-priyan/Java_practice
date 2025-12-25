package T;

import java.util.HashSet;
import java.util.TreeSet;

public class Substring {
	
	
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		
		
		String s="abcde";
		
		
		for (int i = 0; i < s.length(); i++) {
		    for (int j = i + 1; j <= s.length(); j++) {
		        set.add(s.substring(i, j));
		    }
		}

		
		System.out.println(set);
	}

}
