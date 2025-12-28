package Patterns;

public class numberPyramid {
	
	public static void main(String[] args) {
		
		int n=4;
		int idx=1;
		
		for (int i = 1; i<=n; i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(idx++);
			}
			System.out.println();
			
			
		}
		idx--;
		System.out.println();
		
		for (int i = n; i>=1; i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(idx--);
			}
			System.out.println();
			
			
		}
	}

}
