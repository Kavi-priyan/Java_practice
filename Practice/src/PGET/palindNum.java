package PGET;

public class palindNum {
	
	public static void main(String[] args) {
		int og=121321;
		int num=og;
		int goat=0;
		
		while(og!=0) {
			int d=og%10;
			goat=goat *10+d;
			og=og/10;
			
		}
		
	System.out.println(num==goat);
	}

}
