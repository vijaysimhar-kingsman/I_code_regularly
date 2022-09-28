package Graphs;
import java.util.*;
class pair{
    int first;
    int second;
    public pair(int first, int second){
        this. first = first;
        this.second = second;
    }
}
class NoOfIslandsSolution{
		static  void bfs(int row , int col , int visit[][], char grid[][]){
	        visit[row][col]=1;
	        Queue<pair> q = new LinkedList<pair>();
	        q.add(new pair(row, col));
	        int m = grid.length;
	        int n = grid[0].length;
	        
	        while(!q.isEmpty()){
	           int ro = q.peek().first;
	           int co = q.peek().second;
	           q.remove();
	           
	           for(int del_row=-1 ;del_row<=1;del_row++){
	               for(int del_col=-1 ; del_col<=1;del_col++){
	                   int nrow = del_row+ro;
	                   int ncol = del_col+co;
	                   if( (nrow >=0 && nrow<m ) && (ncol>=0 && ncol<n) && 
	                   visit[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
	                       
	                       visit[nrow][ncol]=1;
	                       q.add(new pair(nrow, ncol));
	                   }
	           }
	            
	            
	        }
	    }
    }
	
	public int numIslands(char[][] grid) {
        // Code here
        int m = grid.length;
        int n = grid[0].length;
        int visit [][]= new int[m][n];
        
        int count=0;
        for(int row = 0;row <m;row++){
            for(int col=0;col<n;col++){
                if(visit[row][col]==0 && grid[row][col]=='1'){
                    count++;
                    bfs(row, col, visit, grid);
                    
                }
            }
        }return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call numIslands( send grid);
		
		/* int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
             { 0, 1, 0, 0, 1 },
             { 1, 0, 0, 1, 1 },
             { 0, 0, 0, 0, 0 },
             { 1, 0, 1, 0, 1 } };*/

	}

	

	
}
