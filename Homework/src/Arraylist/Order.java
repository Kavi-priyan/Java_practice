package Arraylist;

public class Order {
	   int orderId;
	    String itemName;
	    String status;

	    Order(int orderId, String itemName, String status) {
	        this.orderId = orderId; this.itemName = itemName; this.status = status;
	    }

	    public String toString() {
	        return orderId + " - " + itemName + " - " + status;
	    }

}
