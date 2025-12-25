package June23.Sup;

public class Child extends Parent{
	
	String  name="Zoro";
	
	void getDetails() {
		System.out.println(super.name);
		System.out.println(this.name);
	}

}
