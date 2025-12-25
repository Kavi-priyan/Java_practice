package july8;

public class Bifunction {
	
	interface BiFunction<T,U,R>{
		R apply(T t,U u);
	}

	
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> s1=Math::max;
		
		System.out.println(s1.apply(76, 858));
	}
}
