package June25;
public class User {
    protected String username;
    protected String password;
    protected String email;
    private Address address;  
    
    public User(String username, String password, String email, Address address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public void watchFreeMovies() {
        System.out.println(username + " is watching free movies.");
    }

    public void watchTrailer() {
        System.out.println(username + " is watching a trailer.");
    }

    public void displayUserDetails() {
        System.out.println("User: " + username);
        System.out.println("Email: " + email);
        System.out.print("Address: ");
        address.displayAddress();
    }
}
