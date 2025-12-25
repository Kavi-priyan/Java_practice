package June25;

public class Driver {
	public static void main(String[] args) {
		  Address addr = new Address("21B", "Baker Street", "London", "NW16XE");
	        PrimeUser prime = new PrimeUser("sherlock", "detective123", "sherlock@221b.com", addr, 199.99, 12);

	        prime.watchTrailer();       
	        prime.watchPrimeMovies();   
	        prime.primeUserDetails();   
	}

}
