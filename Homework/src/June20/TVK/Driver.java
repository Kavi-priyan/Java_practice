package June20.TVK;

public class Driver {
	 public static void main(String[] args) {
	        Cm cm = new Cm();
	        cm.name = "Sosuke aizen";
	        cm.experience = 15;

	        State state = new State("Soul Society", 120000.50, cm);
	        state.displayCmDetails(); 
	    }

}
