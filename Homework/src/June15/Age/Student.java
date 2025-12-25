package June15.Age;

public class Student implements Comparable{
    int rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    // Comparable: Sort by rollNumber (ascending)

    public int compareTo(Student other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    public String toString() {
        return rollNumber + " - " + name + " - " + age;
    }

	
}