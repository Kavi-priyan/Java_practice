package May28;

public class Auto {
	
	public static void main(String[] args) {
		Product p=new Mobile();
		Mobile m=(Mobile)p;
		
		m.setRAM(100);
		m.setDisplaySize(15);
		
		
		System.out.print(((Mobile)p).displayDetails());
	}

}
