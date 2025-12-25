package july8;

public class function {
	
	interface Function<T,R>{
		
		R apply(int a);
		
	}
public static void main(String[] args) {
	
	Function<Integer,String> f1=(a)->a+"Hello";
	
;
	System.out.println(	f1.apply(989));
	
}
}
