package June15.Age;

import java.util.Comparator;

class AverageMarkComparator implements Comparator {
    public int compare(StudentWithMarks s1, StudentWithMarks s2) {
        return Double.compare(s1.getAverage(), s2.getAverage());
    }
}