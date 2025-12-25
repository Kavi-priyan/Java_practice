package May27H2;

public class Driver {

    public static void main(String[] args) {
   
        Bike bike = new Bike();
        bike.setName("Thunderbird");
        bike.setBrand("Royal Enfield");
        bike.setCc(350);

        Car car = new Car();
        car.setName("nano");
        car.setBrand("Tata"); 
        car.setColour("Blue");
        car.setNo_of_seats(4);

  
        System.out.println("Bike:");
        System.out.println("Name: " + bike.getName());
        System.out.println("Brand: " + bike.getBrand());
        System.out.println("CC: " + bike.getCc());

        System.out.println("\nCar:");
        System.out.println("Name: " + car.getName());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Colour: " + car.getColour());
        System.out.println("No. of Seats: " + car.getNo_of_seats());

}
}