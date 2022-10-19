package Graphs;

import Graphs.pair;
import java.util.*;
public class NoOfDistinctIslands {
	static void dfs(int row, int col , int visit[][], int grid[][],
	    ArrayList<String> vec , int row0, int col0){
	        visit[row][col]=1;
	        vec.add(tostring(row-row0 , col-col0));
	        
	        int n = grid.length;
	        int m= grid[0].length;
	        
	        int delrow[]= new int[]{-1,0,1,0};
	        int delcol[]= new int[]{0,1,0,-1};
	        
	        for(int i =0;i<4;i++){
	            int nrow = row + delrow[i];
	            int ncol = col + delcol[i];
	            if(nrow >=0 && nrow <n && ncol>=0 && ncol<m && 
	            visit[nrow][ncol]==0 && grid[nrow][ncol]==1){
	                dfs(nrow , ncol , visit , grid , vec , row0, col0);
	                
	            }
	        }
	  }
    
    private static String tostring(int r , int c){
        return Integer.toString(r)+" "+ Integer.toString(c);
    }
    static int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n = grid.length;
        int m= grid[0].length;
        
        int visit[][]=new int[n][m];
        HashSet<ArrayList<String>> st = new HashSet<>();
         
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visit[i][j]==0 &&  grid[i][j]==1){
                    ArrayList<String> vec = new ArrayList<>();
                    dfs(i,j,visit,grid,vec,i,j);
                    st.add(vec);
                }
            }
        }
        return st.size();
         
         
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = new int[][]{{1, 1, 0, 1, 1}, 
									{1, 0, 0, 0, 0}, 
									{0, 0, 0, 0, 1}, 
									{1, 1, 0, 1, 1}};
		System.out.println("there are "+countDistinctIslands(grid)+" distinct islands");
									
	}

}
