package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOperations {
	

    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            employees.add(new Employee(i, "Emp" + i, 30000 + i * 2000));
        }

        findEmployeeByIdAndName(employees, 5, "Emp5");

      
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            products.add(new Product(i, "Product" + i, 100 + i * 10));
        }
        removeProductById(products, 3);

        
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Ankit", "Charlie", "Andrew", "David"));
        removeNamesStartingWithA(names);

       
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Raj", "Delhi"));
        customers.add(new Customer(2, "Priya", "Mumbai"));
        customers.add(new Customer(3, "Amit", "Delhi"));
        listCustomersByCity(customers, "Delhi");

    
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Movie A", 9.1));
        movies.add(new Movie(2, "Movie B", 7.5));
        movies.add(new Movie(3, "Movie C", 8.3));
        findHighRatedMovies(movies);

       
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Item1", "delivered"));
        orders.add(new Order(2, "Item2", "pending"));
        orders.add(new Order(3, "Item3", "delivered"));
        removeDeliveredOrders(orders);

        
        increaseLowSalaries(employees);
    }

    static void findEmployeeByIdAndName(ArrayList<Employee> list, int id, String name) {
        for (Employee e : list) {
            if (e.id == id && e.name.equalsIgnoreCase(name)) {
                System.out.println("Found Employee: " + e);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void removeProductById(ArrayList<Product> list, int id) {
        list.removeIf(p -> p.id == id);
        System.out.println("Product list after removing ID " + id + ": " + list);
    }

    static void removeNamesStartingWithA(ArrayList<String> names) {
        names.removeIf(n -> n.toUpperCase().startsWith("A"));
        System.out.println("Names after removal: " + names);
    }

    static void listCustomersByCity(ArrayList<Customer> customers, String city) {
        System.out.println("Customers from " + city + ":");
        for (Customer c : customers) {
            if (c.location.equalsIgnoreCase(city)) {
                System.out.println(c);
            }
        }
    }

    static void findHighRatedMovies(ArrayList<Movie> movies) {
        System.out.println("Movies with rating > 8.0:");
        for (Movie m : movies) {
            if (m.rating > 8.0) {
                System.out.println(m);
            }
        }
    }

    static void removeDeliveredOrders(ArrayList<Order> orders) {
        orders.removeIf(o -> o.status.equalsIgnoreCase("delivered"));
        System.out.println("Remaining Orders: " + orders);
    }

    static void increaseLowSalaries(ArrayList<Employee> employees) {
        for (Employee e : employees) {
            if (e.salary < 50000) {
                e.salary *= 1.10;
            }
        }
        System.out.println("Updated Employee Salaries:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}
