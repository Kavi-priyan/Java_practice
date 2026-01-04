package PGET;
import java.math.BigInteger;
import java.util.*;
public class RoundTable
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        int tables = 0,people;
        while (testcases-- > 0) {
           tables = scanner.nextInt();
            people = scanner.nextInt();
            System.out.println(find(tables, people));
        }
        
        scanner.close();
    
    }
    public static BigInteger find(int r,int n) {
    	
    	if(r==0 || r>n) {
    		return BigInteger.ZERO;
 	
    	}
    	
    	if(r==1) {
    		return BigInteger.ONE;
    	}
    	
    	int base=n/r;
    	int extra=n%r;
    	
    	List<Integer> sizes=new ArrayList<>();
    	
    	for(int i=0;i<extra;i++) {
    		sizes.add(base+1);
    	}
    	for(int i=0;i<r-extra;i++) {
    		sizes.add(base);
    	}
    	
    	
    	BigInteger ans=factorial(n);
    	
    	for(int s:sizes) {
    		ans=ans.divide(factorial(s));
    	}
    	
    	Map<Integer,Integer> freq=new HashMap<>();
    	
    	for(int s:sizes) {
    		freq.put(s, freq.getOrDefault(s,0)+1);
    	}
    	
    	for(int s:freq.values()) {
    		ans=ans.divide(factorial(s));
    	}
    	
    	
    	
    	return ans;
    	
    }
	private static BigInteger factorial(int n) {
		// TODO Auto-generated method stub
		BigInteger res=BigInteger.ONE;
		
		for(int i=2;i<=n;i++) {
			res=res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}
  
}