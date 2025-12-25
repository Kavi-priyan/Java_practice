package Priority;

import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQyeye {
	


	public static void main(String[] args) {
		
		  Comparator<String> byName = new Comparator<String>() {
			  @Override
		        public int compare(String a, String b) {
		            return a.length()-b.length();
		        }
		    };
		PriorityQueue<String> q=new PriorityQueue<>(byName);
		 q.offer("Hello0");
		 q.offer("Apple");
		 
	
		
		System.out.println(q);
	}

}
