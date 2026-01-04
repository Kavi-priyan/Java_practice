package PGET;

public class threeDigit {
	
	public static void main(String[] args) {
		int num=4596;
		
		int len=String.valueOf(num).length();
		
		int min=1;
		
		int i=0;
		int max=1;
		
		while(i<len-1) {
			min*=10;
			i++;
			
		}
		
		while(i>=0) {
			max*=10;
			i--;
			
		}
		
	
		
		
		System.out.println(min);
		System.out.println(max-1);
	}

}
