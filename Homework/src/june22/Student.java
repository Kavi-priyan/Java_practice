package june22;

public class Student extends Person {
   private int id;
   private String branch;

    Student(String name, int age, int id, String branch) {
       
        super(name, age);
        this.id = id;
        this.branch = branch;
    }

    void study() {
        System.out.println(name + " is studying " + branch + ".");
    }
}