package June15.Age;

import java.util.Comparator;

public class MovieComparator implements Comparator {
    public int compare(Movie m1, Movie m2) {
        int ratingCompare = Double.compare(m2.rating, m1.rating);
        if (ratingCompare == 0) {
            return m1.name.compareTo(m2.name);
        }
        return ratingCompare;
    }

	
}