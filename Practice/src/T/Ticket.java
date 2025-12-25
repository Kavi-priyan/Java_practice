package T;

public class Ticket {
	
	public static void main(String[] args) {
		
		System.out.println(tickets(4));
		
	}
	
	public static String tickets(int n) {
		if(n<=0) {
			return "";
		}
		
		String code="A";
		
		for(int i=2;i<=n;i++) {
			StringBuilder next=new StringBuilder();
			int count=1;
			
			for(int j=1;j<code.length();j++) {
				
				if(code.charAt(j)==code.charAt(j-1)) {
					count++;
				}
				else {
					next.append(count).append(code.charAt(j-1));
					count=1;
				}
			}
			
			next.append(count).append(code.charAt(code.length()-1));
			code=next.toString();
		}
		
		return code;
	}

}
