package Graphs;
import Graphs.pair;
import java.util.*;
public class NoOfEnclaves {
	
	static int numberOfEnclaves(int[][] grid) {
	    
        // Your code here
        int n = grid.length;
        int m = grid[0].length;
        
        int visit[][]= new int[n][m];
        Queue<pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1 ){
                    if(grid[i][j]==1){
                        visit[i][j]=1;
                        q.add(new pair(i,j));
                    }
                }
            }
        }
        int delrow[]= new int[]{-1,0,1,0};
        int delcol[]=new int[]{0,1,0,-1};
        
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col= q.peek().second;
            q.remove();
            for( int i =0;i<4;i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow >=0 && nrow <n && ncol>=0 && ncol<m &&
                visit[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    visit[nrow][ncol]=1;
                    q.add(new pair(nrow , ncol));
                }
            }
            
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visit[i][j]==0 && grid[i][j]==1){
                  count++;
                }
            }
        }return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid [][]= new int[][] {{0, 0, 0, 0},
									{1, 0, 1, 0},
									{0, 1, 1, 0},
									{0, 0, 0, 0}};
		System.out.println(numberOfEnclaves(grid));		
		
		
	}

}
