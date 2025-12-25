package June25;
public class PrimeUser extends User {
    private double subscriptionAmount;
    private int planDuration;

    public PrimeUser(String username, String password, String email, Address address,
                     double subscriptionAmount, int planDuration) {
        super(username, password, email, address); // inheritance
        this.subscriptionAmount = subscriptionAmount;
        this.planDuration = planDuration;
    }

    public void watchPrimeMovies() {
        System.out.println(username + " is watching prime movies.");
    }

    public void primeUserDetails() {
        super.displayUserDetails(); // reuse base method
        System.out.println("Subscription Amount: " + subscriptionAmount);
        System.out.println("Plan Duration: " + planDuration + " months");
    }
}
