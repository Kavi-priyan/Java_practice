package PGET;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class forestFire {

	public forestFire() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows: ");
		int m=sc.nextInt();
		System.out.println("Enter cols: ");
		int n=sc.nextInt();
		
		
		System.out.println("Enter x: ");
		int x=sc.nextInt();
		System.out.println("Enter y: ");
		int y=sc.nextInt();
		
		x--;
		y--;
		
		char[][] forest=new char[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter coordinates: ");
				forest[i][j]=sc.next().charAt(0);
				}
		}
		
		boolean[][] visited=new boolean[m][n];
		
        // 8 directions
        int[] dr = {-1,-1,-1, 0,0, 1,1,1};
        int[] dc = {-1, 0, 1,-1,1,-1,0,1};
		
		visited[x][y]=true;
		
		int maxtime=1;
		
		
		Queue<int[]> q=new LinkedList<>();
		
		q.offer(new int[] {x,y,1});
		
		
		
		while(!q.isEmpty()) {
			
			int[] cur=q.poll();
			int nr=cur[0];
			int nc=cur[1];
			
			maxtime=Math.max(maxtime, cur[2]);
			
			for(int i=0;i<8;i++) {
				
				int r=nr+dr[i];
				int c=nc+dc[i];
				
				if(r>=0 && r<m && c>=0 && c<n) {
					
					if(!visited[r][c] && forest[r][c]=='T') {
						
						visited[r][c]=true;
						q.offer(new int[] {r,c,cur[2]+1});
					}
				}
				
			}
	}
		
		
		
		System.out.println(maxtime);
	}

}
