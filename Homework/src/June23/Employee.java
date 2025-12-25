package June23;

public class Employee {
	public Employee(int id, long salary) {
	
		this.id = id;
		this.salary = salary;
	}

	private int id;
	private long salary;
	
	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
