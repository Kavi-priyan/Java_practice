package Sakuradite;

public class Black {
	
	public static void main(String[] args) {
		try {
			System.out.println("pppppppppp");
			System.out.println(10/0);
			
			System.out.println("ooooo");
			
		} catch (Throwable t ) {
			System.out.println("I am here");
			System.out.println(t.getMessage());
			
			System.out.println();
			
			System.out.println(t.toString());
			
			System.out.println(t.getStackTrace());
			
		}
	}

}
