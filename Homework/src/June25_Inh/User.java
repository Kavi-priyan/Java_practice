package June25_Inh;
public class User {
    protected String username;
    protected String password;
    protected String email;
  // Composition: strong ownership

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    
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
      
    }
}
