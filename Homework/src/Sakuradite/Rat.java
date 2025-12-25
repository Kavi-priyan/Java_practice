package Sakuradite;

public class Rat implements Comparable{
	
	int price;
	String fore;

	public Rat(int price,String h) {
		
				this.price=price;
				fore=h;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Rat r=(Rat)o;
		return this.price-r.price;
	}
	
	public int stringTo(String m) {
		return this.fore.compareTo(m);
		
	}


}
