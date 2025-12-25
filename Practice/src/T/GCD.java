package T;

public class GCD {
	  public static void main(String[] args) {
	        int gcd=1;
	        
	        for(int i=1;i<=24 && i<=81;i++){
	            if(24%i==0 && 8%i==0){
	                gcd=i;
	            }
	            
	        }
	        
	        System.out.println(gcd);
	    }

}
