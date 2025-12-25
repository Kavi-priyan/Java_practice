package Hashset;

public class Student  implements Comparable<Student> {
int age;

public Student(int age, String name, int id) {
	super();
	this.age = age;
	this.name = name;
	this.id = id;
}
String name;
int id;








//
//@Override
//public int compareTo(Student o) {
//	
//	return Integer.compare( this.age,o.age);
//}
//
//
//
//





@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}









@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}









@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}



















@Override
public String toString() {
	return "\n Student [age=" + age + ", name=" + name + ", id=" + id + "] \n";
}









@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
}
