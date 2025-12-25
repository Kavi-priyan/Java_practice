package June15.Age;

class Product {
    int id;
    String name;
    double price;
    double rating;

    public Product(int id, String name, double price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return id + " - " + name + " - " + price + " - " + rating;
    }
}
