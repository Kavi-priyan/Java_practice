package May27H;

public class Driver {

    public static void main(String[] args) {
        // Create and set data for Cat
        Cat cat = new Cat();
        cat.setName("Tom");

        // Create and set data for Dog
        Dog dog = new Dog();
        dog.setName("Bruno");
        dog.setNo_of_legs(4);

        // Print Cat data
        System.out.println("Cat:");
        System.out.println("Name: " + cat.getName());

        // Print Dog data
        System.out.println("\nDog:");
        System.out.println("Name: " + dog.getName());

        System.out.println("No. of Legs: " + dog.getNo_of_legs());
    }
}
