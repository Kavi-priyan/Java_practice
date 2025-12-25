package Jun4;

public class Summa_String {

	public static void main(String[] args)
	{
		String s="madam, in eden,i'm adam";
		s=s.toLowerCase();
		s=s.trim();
		int i=0;
		int j=s.length()-1;
		boolean a=true;
		
		while(i<j)
		{
			char c1=s.charAt(i);
			char c2=s.charAt(j);
			
			boolean b1=(c1>='a' && c1<='z')||(c1>='0' && c1<='9');
			boolean b2=(c2>='a' && c2<='z')||(c2>='0' && c2<='9');
			
			if(b1&&b2&&c1!=c2)
			{
				System.out.println("false");
			    a=false;
				break;
			}
			else if(!b1)
			{
				i++;
			}
			else if(!b2)
			{
				j--;
			}
			else
			{
				i++;
				j--;
			}

		}
		if(a)
		{
			System.out.println("Palindrome");
			
		}
		
		
		
	}
}
