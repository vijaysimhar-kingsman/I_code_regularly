package Graphs;

public class FloodFillAlgo {
	 static void dfs(int [][]image ,int adj[][], int sr , int sc , int newColor,int mark ,int delrow[],int delcol[]){
	        adj[sr][sc]=newColor;
	        int n = adj.length;
	        int m = adj[0].length;
	        
	        for(int i=0;i<4;i++){
	            int nrow = sr+delrow[i];
	            int ncol = sc+delcol[i];
	            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
	                   if(image[nrow][ncol]==mark && adj[nrow][ncol]!=newColor) 
	                   dfs(image, adj , nrow , ncol , newColor , mark,delrow , delcol);
	          
	            }
	        }
	        
	    }
	    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
	    {
	        
	        //setp1 : create copy of image call dfs with sr,sc and new color
	        int row = image.length;
	        int col = image[0].length;
	        int adj [][]=image;
	        int mark = image[sr][sc];
	       
	        int delrow[]= new int[]{-1,0,+1,0};
	        int delcol[]= new int[]{0,1,0,-1};
	        
	        dfs(image,adj , sr,sc , newColor,mark , delrow, delcol);
	        return adj;
	        
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
