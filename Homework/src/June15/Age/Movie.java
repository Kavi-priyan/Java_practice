package June15.Age;

public class Movie implements Comparable{
    String name;
    int year;
    double rating;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String toString() {
        return name + " - " + year + " - " + rating;
    }


    public int compareTo(Movie other) {
        return Integer.compare(this.year, other.year);
    }
}