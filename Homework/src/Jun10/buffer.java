package Jun10;

public class buffer {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("Hello");
	System.out.println(s);
	 StringBuffer s2=s;
	 System.out.println();
	System.out.println(s2==s);
	System.out.println(s2.equals(s));
	
	StringBuffer s3=new StringBuffer("Hello");
	
	s3.trimToSize();
	
	System.out.println(s3.capacity());
	System.out.println(s3.reverse());
	System.out.println(s3==s);
	System.out.println(s.equals(s3));
			
	System.out.println();
	
	System.out.println(new String(s).equals(new String(s3)));
}

}
