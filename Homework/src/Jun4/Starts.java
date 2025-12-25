package Jun4;

public class Starts {
	
	public static void main(String[] args) {
		String[] arr= {"Kabim kubaam","kubaam kabeem","kambi kumba","kmba kambi","mirugina jumbo"};
		String s="m";
		
		char w='m';
	//	   char ch = sc.next().charAt(0); 
		
		
		for(String i:arr) {
			if(i.startsWith(String.valueOf(w)) || i.startsWith(String.valueOf(w).toUpperCase())) {
				System.out.println(i);
				
			}else {
				System.out.println("No match found...");
			}
		}
	}

}
