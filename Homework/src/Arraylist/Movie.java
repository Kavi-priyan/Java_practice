package Arraylist;

public class Movie {

    int id;
    String name;
    double rating;

    Movie(int id, String name, double rating) {
        this.id = id; this.name = name; this.rating = rating;
    }

    public String toString() {
        return id + " - " + name + " - Rating: " + rating;
    }

}
