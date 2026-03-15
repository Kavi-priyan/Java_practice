package NQT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TDmatrixsum {

	public TDmatrixsum() {
		// TODO Auto-generated constructor stub
	}
	
	static class FastScanner{
		private final BufferedReader br ;
		private StringTokenizer st;
		
		public FastScanner(InputStream is) {
			
			br=new BufferedReader(new InputStreamReader(is));
			
		}
		
		
		String next() throws IOException{
			
			while(st==null || !st.hasMoreElements()) {
				st=new StringTokenizer(br.readLine());
			}
			
			return st.nextToken();
						
		}
		
		int nextInt() throws IOException{
			
			return Integer.parseInt(next());
		}
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		FastScanner fs=new FastScanner(System.in);
		
		int n=fs.nextInt();
		int k=fs.nextInt();
		
		int size=2*n;
		
		int[][] arr=new int[n][n];
		
		long[][] B=new long[2*n][2*n];
		long[][] P=new long[size+1][size+1];
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				arr[i][j]=fs.nextInt();
			}
		}
		
		
		
		
for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				
				B[i][j]=arr[i%n][j%n];
			}
		}







for(int i=1;i<=size;i++) {
	long rowSum=0;
	
	for(int j=1;j<=size;j++) {
		
		 rowSum+= B[i-1][j-1]  ;
		 
		 P[i][j]= P[i-1][j] + rowSum;
	}
}

long maxSum=0;

for(int i=0;i<n;i++) {
	long rowSum=0;
	
	for(int j=0;j<n;j++) {
		
		int x1=i+1;
		int y1=j+1;
		int x2=i+k;
		int y2=j+k;

		long value=(P[x1-1][y1 - 1] -P[x1-1][y2] - P[x2][y1-1]+ P[x2][y2]) ;
		maxSum=Math.max(maxSum, value);
	}
	
	
}




System.out.println(maxSum);
		
		
	}

}
