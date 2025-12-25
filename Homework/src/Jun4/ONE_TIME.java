package Jun4;
import java.util.Scanner;
public class ONE_TIME {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		String s=sc.nextLine();
		boolean otp=true;
		
		int a=s.length();
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
			{
				otp=false;
			}
			
		}
		if(otp)
		{
			System.out.println("True");
		}
		else
			System.out.println("false");
	}
}
