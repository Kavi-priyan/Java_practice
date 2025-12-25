package recursion;

import java.util.ArrayList;
import java.util.List;

public class Phone {

	   static String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	   public static List<String> letterCombinations(String digits) {
	        List<String> list=new ArrayList<>();
	        
	        if (digits.isEmpty()) {
	            return list;
	        }
	        backtrack(list,new String(),digits,0);
			return list;   
	        
	    }
	   
	   
	
	private static void backtrack(List<String> list,String number, String digits, int i) {
	
		
		if(number.length()==digits.length()) {
			list.add(number);
			return;
			
		}
		
		String letters=mapping[digits.charAt(i)-'0'];
		
		
		for(int i1=0;i1<letters.length();i1++) {
			number=number+letters.charAt(i1);
			backtrack(list,number,digits,i+1);
			number=number.substring(0, number.length()-1);
		}
		
	}



	public static void main(String[] args) {
		String digits = "23";
		
		 List<String> list=letterCombinations(digits);
		 
		 System.out.println(list);
		
	}

}
