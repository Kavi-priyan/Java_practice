package May26;

public class Car extends Vehicle {
	public Car(String fuelType, int nofdoors,String brand, int price) {
		super(brand,price);
		FuelType = fuelType;
		Nofdoors = nofdoors;
	}
	String FuelType;
	int Nofdoors;
	

}
