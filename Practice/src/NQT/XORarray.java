package NQT;

public class XORarray {

	public XORarray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		
		
		if(arr.length%2==0) {
			System.out.println(0);
			System.exit(0);
		
		
		}
		
		int xor=arr[0];
		
		for(int i=2;i<arr.length;i+=2) {
			xor^=arr[i];
		}
		
		System.out.println(xor);

	}

}
