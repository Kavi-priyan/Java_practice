package July5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Driver {

	
	
	
	public static void main(String[] args) {
		
		
		Comparator<Student> comp=new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int avg1=0;
				int avg2=0;
				
				for(int i=0;i<o1.marks.length;i++) {
					avg1+= o1.marks[i];
					avg2+= o2.marks[i];
					
				}
				
				avg1/=o1.marks.length;
				avg2/=o2.marks.length;
				
				return avg1-avg2;
			}
			
		
			
		};
		
		ArrayList<Student> stu=new ArrayList<Student>();

		stu.add(new Student(103,25, new int[]{12,33,74,85,36} ) );
		stu.add(new Student(101,65, new int[]{2,3,4,5,6} ) );

		stu.add(new Student(102,35, new int[]{32,23,74,75,96} ) );
		
	    stu.sort(comp); // sort by average marks (descending)

        System.out.println(stu.get(stu.size()-1));
		
		
		
		
	}
}
