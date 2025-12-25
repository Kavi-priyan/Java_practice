package Jun25;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
public static void main(String[] args) {
	
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(new Student(1,11));
	list.add(new Student(2,01));
	list.add(new Student(3,10));
	list.add(new Student(4,101));
	list.add(new Student(-4,101));
	
	int key1=101;
	
	ArrayList list1=new ArrayList();
	
	
	Student key=new Student(4,101);
	Student s1=null;
	
	for (Student student : list) {
		if(key1==student.name) {
			list1.add(student);
			s1=student;
			
			
		}
		
		
		
	}
	if(list.remove(s1)){
		System.out.println("Target removed");
		System.out.println(list);
		System.out.println();
	}
	
	
	System.out.println(s1==null?"ENF":s1);
	System.out.println();
	System.out.println(list1);
	System.out.println();
	System.out.println(list.contains(key));
	
	
}
}
