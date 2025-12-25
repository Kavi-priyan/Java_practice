package Jun4;

public class Rev_str {

	public static void main(String[] args)
	{
		String s="Hello    World";
		s=s.trim();
		String[] s1=s.split("[ ]+");
		
		
		int size=s1.length;
		String[] s2=new String[size];
		int j=0;
		for(int i=s1.length-1;i>=0;i--)
		{
			s2[j]=s1[i];
			j++;
		}
		s=String.join("HI", s2); //Joins one or more strings with a specified separator
		System.out.println(s);
	}
}
