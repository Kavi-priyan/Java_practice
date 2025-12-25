package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {
	
	int id;
	int age;
	
	String name;
	String deptName;
	String cityName;
	public Employee(int id, int age, String name, String deptName, String cityName, long salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.deptName = deptName;
		this.cityName = cityName;
		this.salary = salary;
	}
	long salary;
	
	
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,98,43,21,21);
		List<Employee> list3=Arrays.asList(new Employee(12,23,"Balak","DS"," Gotham",400000),new Employee(13,43,"Gallley la","DS"," Central city",700000));
		
		Integer maxValue = list.stream().max(Comparator.naturalOrder()).get(); 

		
		List<Integer> list2=list.stream().sorted().distinct().toList();
		List<Employee> list4 = list3.stream()
			    .map(emp -> new Employee(
			        emp.id + 100,
			        emp.age,
			        emp.name,
			        emp.deptName,
			        emp.cityName,
			        emp.salary
			    )).filter(emp->emp.age>21)
			    .toList();

	     System.out.println("Max value: " + maxValue);
	        System.out.println("Distinct list: " + list2);
	    //    System.out.println("Modified employee IDs: " + list4); 
	        System.out.println();
	        
	        
	        list3.stream().filter(emp->emp.name.startsWith("B")).forEach(System.out::println);
	    
	        System.out.println(    list3.stream().filter(emp->emp.name.startsWith("B")).count());
	        
	        list3.stream().filter(emp->emp.age>21).sorted((x,y)->(int)(y.salary-x.salary))
		    .map(emp -> new Employee(
		        emp.id + 100,
		        emp.age,
		        emp.name,
		        emp.deptName,
		        emp.cityName,
		        emp.salary
		    ))
		    .forEach(System.out::println);;
		    
		    
		 	}  
	



	@Override
	public String toString() {
	    return  "\n╔════════════════════════════════════╗" +
	            "\n║          Employee Details          ║" +
	            "\n╠════════════════════════════════════╣" +
	            String.format("\n║ %-10s : %-20s  ║", "ID", id) +
	            String.format("\n║ %-10s : %-20s  ║", "Name", name) +
	            String.format("\n║ %-10s : %-20d  ║", "Age", age) +
	            String.format("\n║ %-10s : %-20s  ║", "Department", deptName) +
	            String.format("\n║ %-10s : %-20s  ║", "City", cityName) +
	            String.format("\n║ %-10s : ₹%-20d ║", "Salary", salary) +
	            "\n╚════════════════════════════════════╝\n";
	}




}
