package Arch;

public class Dirver {
	public static void main(String[] args) {
		D d=new D();
		
		C c=new C();
		
	Movie m=new Horror();
	
	Horror h1=(Horror)m;
	
	System.out.println(h1.name1);
	
	if(c instanceof Movie) {
		System.out.println("naan thaan");
		
	}
	System.out.println(((Horror) m).name);
		
		
		
	
		
		
		
		
		
	}

}
