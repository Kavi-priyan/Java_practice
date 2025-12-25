package Jun18;

import java.util.Arrays;

public class Vreverse {
public static void main(String[] args) {
	
	String s="leetcode";
	
	int left=0;
	int ryt=s.length()-1;
	
	String n="";
	
	char[] arr=s.toCharArray();
	
	
	while(left<ryt) {
		
		char l=arr[left];
		char r=arr[ryt];
		
		boolean lt= (l=='a' || l=='e' || l=='i' || l=='o' || l=='u');
		boolean rt= (r=='a' || r=='e' || r=='i' || r=='o' || r=='u');
		
		if(lt && rt){
			arr[ryt]=l;
			arr[left]=r;
			
			ryt--;
			
			left++;
			
			}
		else if(lt) {
			ryt--;
		}
		else if(rt) {
			left++;
		}
		
		else {
			left++;
			ryt--;
		}
		
		
	}
	
	
		
		
	
	for (char c : arr) {
		System.out.print(c);
		
	}
}
}
