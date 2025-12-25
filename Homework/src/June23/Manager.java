package June23;

public class Manager extends Employee {
	
	public Manager(int id,long salary,String department) {
		super(id,salary);
		this.department = department;
		
	}

	String department;


	
	public void printDetails() {
		System.out.println("Employee from "+ department+" has salary of "+getSalary());
	}
	
	
	
		
	
	

}
