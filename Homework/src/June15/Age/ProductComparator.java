package June15.Age;

public class ProductComparator implements Comparator {
    public int compare(Product p1, Product p2) {
        int priceCompare = Double.compare(p1.price, p2.price);
        if (priceCompare == 0) {
            return Double.compare(p2.rating, p1.rating);
        }
        return priceCompare;
    }
}
