package May27;

public class Driver {
	
	public static void main(String[] args) {
		Person b1=new Person("Batman");
		
		Student s=new Student("Supe",1011);
		
		
		Person b=(Student)de s;
		
		System.out.println(b.name);
		System.out.println(b.id);
		
	}

}
