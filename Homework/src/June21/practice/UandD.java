package June21.practice;

public class UandD {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5,3,6,6,6,7,8,8,8,2,9,9};
		int u=0;
		int d=0;

		boolean[] visited=new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			int temp=1;
			
			if(visited[i]) {
				continue;
			}
		
		
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					temp++;
				}
				
				
			}
			
			
			if(temp==1) {
				u++;
			}else {
				d++;
			}

		
		}
		
		System.out.println(d);
		System.out.println(u);
	}

}
