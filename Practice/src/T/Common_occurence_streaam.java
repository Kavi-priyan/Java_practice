package T;

import java.util.LinkedList;
import java.util.Queue;

public class Common_occurence_streaam {
		
	public static void subs(String stream) {
		
		int[] freq=new int[256];
		
		Queue<Character> queue=new LinkedList<>();
		
		for (int i = 0; i < stream.length(); i++) {
			
			char ch=stream.charAt(i);
			freq[ch]++;
			queue.offer(ch);
			
			while(!queue.isEmpty() && freq[queue.peek()]>1) {
				queue.poll()
;			}
			
			   if (!queue.isEmpty()) {
	                System.out.print(queue.peek() + " ");
	            } else {
	                System.out.print("- ");
	            }
			
			
		}
		
		
	}
	
	 public static void main(String[] args) {
	        String input = "aabcbd";
	        System.out.println("Input stream: " + input);
	        System.out.print("First non-repeating characters: ");
	        subs(input);
	    }

}
