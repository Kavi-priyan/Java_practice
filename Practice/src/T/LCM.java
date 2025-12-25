package T;

public class LCM {
	
	public static void main(String[] args) {
		int a=12;
		int b=24;
		
		int n=(a>b)?a:b;
		
		while(true) {
			if(n%a==0 && n%b==0)
				break;
			
			n++;
		}
		
		
		System.out.println(n);
	}
}
