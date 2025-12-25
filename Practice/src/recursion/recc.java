package recursion;

public class recc {
	public static void main(String[] args) {
		print(2);
	}

	private static void print(int n) {
		if(n==0) {return;}
		int c=0;
		System.out.println(n);
		print(n-1);
		print(n-1);
		
		
	}

}
