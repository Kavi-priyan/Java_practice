package June15.Age;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Main {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        // 1. Students
        List<Student> students = Arrays.asList(
            new Student(3, "Alice", 20),
            new Student(1, "Bob", 22),
            new Student(2, "Charlie", 19)
        );
        Collections.sort(students); // by rollNumber
        System.out.println("Sorted by roll: " + students);
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name: " + students);
        Collections.sort(students, new AgeComparator());
        System.out.println("Sorted by age desc: " + students);

        // 2. Products
        List<Product> products = Arrays.asList(
            new Product(1, "Pen", 10.0, 4.3),
            new Product(2, "Notebook", 10.0, 4.8),
            new Product(3, "Eraser", 5.0, 4.0)
        );
        Collections.sort(products, new ProductComparator());
        System.out.println("Sorted Products: " + products);

        // 3. Movies
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 2010, 9.0),
            new Movie("Interstellar", 2014, 9.0),
            new Movie("The Prestige", 2006, 8.5)
        );
        Collections.sort(movies); // by year
        System.out.println("Movies by year: " + movies);
        Collections.sort(movies, new MovieComparator());
        System.out.println("Movies by rating/name: " + movies);

        // 4. Employees
        List<Employee> employees = Arrays.asList(
            new Employee(3, "John", 70000),
            new Employee(1, "Maxwell", 50000),
            new Employee(2, "Al", 60000)
        );
        Collections.sort(employees); // by id
        System.out.println("Employees by ID: " + employees);
        Collections.sort(employees, new NameLengthComparator());
        System.out.println("Employees by name length: " + employees);
        Collections.sort(employees, new SalaryComparator());
        System.out.println("Employees by salary: " + employees);

        // 5. StudentWithMarks
        List<StudentWithMarks> studentMarksList = Arrays.asList(
            new StudentWithMarks(1, "Tom", new int[]{80, 70, 60, 90, 85}),
            new StudentWithMarks(2, "Jerry", new int[]{60, 65, 70, 75, 80}),
            new StudentWithMarks(3, "Spike", new int[]{90, 88, 95, 93, 91})
        );
        Collections.sort(studentMarksList, new AverageMarkComparator());
        System.out.println("Students by average marks: " + studentMarksList);
    }
}
