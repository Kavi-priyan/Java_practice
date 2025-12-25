package recursion;

public class skip {
	public static void main(String[] args) {
		String s="baccad";
		String s1="baccaappled";
		StringBuilder naan=new StringBuilder();
		
		
		String d=rec(s);
		
		//iterative
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='a' ) {
				
				continue;
				
			}
			else {
				naan.append(s.charAt(i));
			}
			
		}
		System.out.println(s.substring(2));
		System.out.println(d);
	//remove	character recursivel
		System.out.println(naan);
		
		
		System.out.println(rec1(s1));
	}

	
	
	
	private static String rec(String s) {
		// TODO Auto-generated method stub
		if(s=="") {return "";}
		
		char first=s.charAt(0);
		
		String rest=rec(s.substring(1));
		
		
		return (first=='a')? rest: first+rest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static String rec1(String s) {
	    // Base case: if string is empty, return empty string
	    if (s.equals("")) {
	        return "";
	    }

	    String first = "apple";

	    // If string starts with "apple", skip it and process the rest
	    if (s.startsWith(first)) {
	        return rec1(s.substring(first.length()));
	    } 
	    // Otherwise, keep the first character and process the rest
	    else {
	        return s.charAt(0) + rec1(s.substring(1));
	    }
	}

}
