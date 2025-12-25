package June25;

public class Address {
    private String doorNo;
    private String street;
    private String city;
    private String pincode;

    public Address(String doorNo, String street, String city, String pincode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public void displayAddress() {
        System.out.println(doorNo + ", " + street + ", " + city + " - " + pincode);
    }
}
