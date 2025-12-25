package Jun23;

public class Driver {
public static void main(String[] args) {
	Generics<String> s=new Generics<String>("kkk");
	Generics<Integer> s1=new Generics<Integer>(999);
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	Generics s4=new Generics(0000);   
}
}
