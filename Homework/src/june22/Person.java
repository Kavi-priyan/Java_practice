package june22;

public class Person {
	  String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void eat() {
	        System.out.println(name + " is eating.");
	    }

	    void walk() {
	        System.out.println(name + " is walking.");
	    }

}
