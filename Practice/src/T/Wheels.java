package T;

public class Wheels {
	public static void main(String[] args) {
		int v=200;
		int w=540;
		
		double res=(4*v-w)/2;
		
		if(2<=w && v<w && w%2==0) {
			System.out.println("Two wheelers: "+res+"\nFour Wheelers "+(v-res));
		}
		
		
		
		
		System.out.println();
		
		
		String prep="####primord*L***";
		
		int star_count=0;
		
		int hash_count=0;
		
		for(char i:prep.toCharArray()) {
			if(i=='*') {
				star_count++;
			}
			else if(i=='#') {
				hash_count++;
			}
			
			
			
			
		}
		
		System.out.println(star_count-hash_count);
		
		
		System.out.println();
		
		
		int[] arr= {3,4,5,8,9};
		int start=arr[0];
		int count=1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>start) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
