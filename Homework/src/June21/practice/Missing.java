package June21.practice;

public class Missing {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5,5,6,6,6,7,8,8,8,19};
		
		int n=19;
		boolean[] visited=new boolean[n+1];
		
		for(int i=0;i<arr.length;i++) {
			  if (arr[i] <= n && arr[i] >= 1) {
				  visited[arr[i]] = true;
	            }
		}
		
		
		for (int i = 0; i < visited.length; i++) {
			if(!visited[i]) {
				System.out.println(i);
			}
			
		}
		
		
	}

}
