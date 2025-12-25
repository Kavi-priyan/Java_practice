package Arraylist;

public class Customer {
    int id;
    String name;
    String location;

    Customer(int id, String name, String location) {
        this.id = id; this.name = name; this.location = location;
    }

    public String toString() {
        return id + " - " + name + " - " + location;
    }

}
