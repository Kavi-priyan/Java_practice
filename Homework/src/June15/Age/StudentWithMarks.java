package June15.Age;

class StudentWithMarks {
    int roll;
    String name;
    int[] marks; // array of 5 marks

    public StudentWithMarks(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    double getAverage() {
        int total = 0;
        for (int m : marks) total += m;
        return total / 5.0;
    }

    public String toString() {
        return roll + " - " + name + " - Avg: " + getAverage();
    }
}