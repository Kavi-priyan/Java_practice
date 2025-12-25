package July5;

import java.util.Arrays;

public class Student {
int id;
	
	public Student(int id, int age, int[] marks) {
	super();
	this.id = id;
	this.age = age;
	this.marks = marks;
}

	int age;
	
	int[] marks=new int[5];

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", marks=" + Arrays.toString(marks) + "] \n";
	}
	
	
}
