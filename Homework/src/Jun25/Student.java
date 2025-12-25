package Jun25;

public class Student {
	int id;
	int name;

	public Student() {
		
	}

	
	@Override
	public String toString() {
		return "Student [id= " + id + ", name= " + name + "]";
	}


	@Override
	public boolean equals(Object obj) {
	
		Student s=(Student) obj;
		
		return this.name==s.name && this.id == s.id;
	}


	public Student(int id, int name) {
		super();
		this.id = id;
		this.name = name;
	}


}
