package June20;

public class Blah {
public static void main(String[] args) {
	int a = 10, b = 20;
	int res = a>b++ && ++a<b ? b++ : b--;
	System.out.print(a);
	System.out.print(b);
	
	boolean c = (boolean)true;
	
	if(c)
	  System.out.println("if block");
	else
	  System.out.println("else block");


}
}
