package Hashset;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
	
	
public static void main(String[] args) {
    Comparator<Student> byName = new Comparator<Student>() {
        public int compare(Student a, Student b) {
            return a.name.compareTo(b.name);
        }
    };
	TreeSet<Student> s=new TreeSet(byName);
	
	
	
	
	s.add(new Student(12,"Gamal",01));
	s.add(new Student(13,"Samal",02));
	
	s.add(new Student(14,"Damal",03));
	s.add(new Student(14,"Damal",03));
	
	System.out.println(s);
	
}
}
