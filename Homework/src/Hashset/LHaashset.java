package Hashset;

import java.util.LinkedHashSet;

public class LHaashset {
	
	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();
		
		s.add(324);
		s.contains(324);
		s.addFirst(234);
		s.add(345);
		s.removeLast();
		System.out.println(s.size());
		
		System.out.println(s);
		System.out.println(s.getLast());
	}

}
