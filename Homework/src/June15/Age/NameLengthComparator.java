package June15.Age;

import java.util.Comparator;

public class NameLengthComparator implements Comparator {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.name.length(), e2.name.length());
    }

	
}