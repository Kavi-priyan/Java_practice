package May27H2;
public class Cart {
    private Item slot1;
    private Item slot2;
    private Item slot3;
    private int count = 0;

    public void addItem(Item item) {
        if (count == 0) {
            slot1 = item;
        } else if (count == 1) {
            slot2 = item;
        } else if (count == 2) {
            slot3 = item;
        } else {
            System.out.println("Cart is full.");
            return;
        }
        count++;
    }

    public void displayCart() {
        if (slot1 != null) slot1.display();
        if (slot2 != null) slot2.display();
        if (slot3 != null) slot3.display();
    }
}
