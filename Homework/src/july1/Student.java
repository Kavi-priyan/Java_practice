package july1;


public class Student {
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	int id;
	String name;
	int age;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s1=(Student)obj;
		return this.id==s1.id && this.age==s1.age;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	

}
