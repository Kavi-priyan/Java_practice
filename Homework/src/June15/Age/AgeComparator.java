package June15.Age;

import java.util.Comparator;

class AgeComparator implements Comparator {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.age, s1.age);
    }
}