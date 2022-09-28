package Graphs;
import java.util.*;
class triple{
    int first;
    int second;
    int time;
    triple(int f , int s , int t){
        this.first =f;
        this.second =s;
        this.time =t;
    }
}

public class RottenOranges {

	 public int orangesRotting(int[][] grid)
	    {
	        // Code here
	        int n = grid.length;
	        int m = grid[0].length;
	        
	        int visit[][]=new int[n][m];
	        
	        Queue<triple> q = new LinkedList<>();
	        
	        int freshCount=0;
	        for(int i =0;i<n;i++){
	            for(int j = 0;j<m;j++){
	                if(grid[i][j]==2){
	                    q.add(new triple(i,j,0));
	                    visit[i][j]=2;
	                }if(grid[i][j]==1){
	                    freshCount++;
	                }
	            }
	        }int tm=0;
	        int cnt=0;
	        int delrow[]=new int[]{-1,0,1,0};
	        int delcol[]=new int[]{0,1,0,-1};
	        while(!q.isEmpty()){
	            int r = q.peek().first;
	            int c = q.peek().second;
	            int t = q.peek().time;
	            tm=Math.max(tm,t);
	            q.remove();
	            
	            for(int i=0;i<4;i++){
	                int nrow = r+delrow[i];
	                int ncol = c + delcol[i];
	                if(nrow >=0 && nrow<n && ncol>=0 && ncol<m){
	                    if(visit[nrow][ncol]==0 && grid[nrow][ncol]==1){
	                        q.add(new triple(nrow,ncol,t+1));
	                        visit[nrow][ncol]=2;
	                        cnt++;
	                    }
	                }
	            }
	        }
	        if(cnt == freshCount) return tm;
	        else  return -1;
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call orangesRotting(pass a adj matrix);
	}

}
