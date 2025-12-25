package May26;

public class ECar extends Car {
	

	public ECar(double batterycapacity, int range,String fuelType, int nofdoors,String brand, int price) {
		super(fuelType, nofdoors,brand, price);
		this.batterycapacity = batterycapacity;
		this.range = range;
	}

	

	double batterycapacity;
    int range;
    
    void idk() {
    	System.out.println(price);
    	
    }
}
