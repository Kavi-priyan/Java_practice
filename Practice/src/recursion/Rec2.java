package recursion;

public class Rec2 {
public static void main(String[] args) {
	
	
	System.out.println(test("AB"));
}

private static String test(String string) {
	// TODO Auto-generated method stub
	if(string.isEmpty()) {
		return string;
	}
	return test(string.substring(1))+string.charAt(0);
}
}
