package recursion;

public class recc2 {
	
	public static void main(String[] args) {
		System.out.println(number(3));
	}

	private static int number(int i) {
		if(i<=12) {
			return number (number(number(i+7)));
		}
		else{
		return	i+4;
		}
	
	}

}
