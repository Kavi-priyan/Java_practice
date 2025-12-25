package Jun4;

public class Bad {
	
	public static void main(String[] args) {
		
		String[] arr= {"bad","hate","ugly"};
		
		String s="Happy birthday hate boy";
			

		
		for(String i:arr) {
			String s1=s.toLowerCase();
			if(s1.contains(i)) {
				System.out.println("Do not spread negativity");
				break;
			}
			else {
				System.out.println("Hi");
			}
		}
	}

}
