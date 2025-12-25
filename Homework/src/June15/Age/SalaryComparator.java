package June15.Age;

import java.util.Comparator;

class SalaryComparator implements Comparator {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}