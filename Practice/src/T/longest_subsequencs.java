package T;

public class longest_subsequencs {
	public static void main(String[] args) {
		String a="San";
		String b="Kavi priySan";
		
		System.out.println(mins(a,b,a.length(),b.length()));
		
	}
	
	static int mins(String a,String b,int m,int n) {
		
		if(m==0 || n==0) {
			return 0;
		}
		
		if(a.charAt(m-1)==b.charAt(n-1)) {
			return 1+ mins(a,b,m-1,n-1);
		}
		else {
			return Math.max(mins(a,b,m-1,n),mins(a,b,m,n-1));
		}
		
	
		
	}

}
