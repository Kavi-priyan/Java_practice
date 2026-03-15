package NQT;

public class Monkey {

	public Monkey() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int total=100;
		
		int rise=20;
		
		int slip=5;
		
		int min=0;
		
		while(total>=20) {
			
			total-=rise-slip;
			min++;
		}
		
		System.out.println(min+1);
	}

}
