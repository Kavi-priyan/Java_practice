package Jun4;

public class FindaRotate {

	public static void main(String[] args) {
		
		String s1="yazh";
		String s2="hyaz";

		String s3="";

		boolean cond=false;
		int j=0;
		
	while(j<s2.length()) {
		
		s3="";
	for(int i=0;i<s1.length();i++) {
			
		
			
			if(i==(s1.length()-1)){
				 s3 = s3 + s1.charAt(0);
				
			}else {
				s3=s3+s1.charAt(i+1);
			}
		}
	
	   if (s3.equals(s2)) {
           cond = true;
           break;
       } else {
           s1 = s3; 
           j++;
       }
		
	}
		

		
		System.out.println(cond);
	}

}
