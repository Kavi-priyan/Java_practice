package May29;

public class Tier extends Cow{
	
	void eat() {
		System.out.println("Full meals");
		
		
	}
	
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		
		Cow c1=new Cow();
		c1.eat();
		
		Animal a2=new Cow();
		a2.eat();
	}

}
