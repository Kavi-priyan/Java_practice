package Bit;

public class numtoBit {
	
	public static void main(String[] args) {
		int num=33;
		String bit="";
		
		if(num==0) {
			bit="0";
		}else {
			
			while(num>0) {
				
					bit=(num%2)+bit;
				
				num/=2;
				
			}
			
		}
		
		
		
		System.out.println(bit);
	}

}
