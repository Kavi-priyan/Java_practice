package Sakuradite;

public class Exse {
	
	public static void  method() throws ArithmeticException
	{
		System.out.println(12/0);
	}
	
	public static void method1() throws Exception{
		
	    method();
	}
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Gotcha");;
		}
		
	}

}
