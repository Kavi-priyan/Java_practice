package Jun24;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();
		
		list.add(10);
		
		ArrayList list1=new ArrayList();
		list1.add(2);
		list1.add(90);
		
		list.addAll(list1);
		
		
		for (int i = 0; i < list1.size(); i++) {
			list1.get(i);
	
			
		}
		System.out.println(list.toString());
	}

}
