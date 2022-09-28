package Graphs;
import java.util.*;
class Node{
    int row;
    int col;
    int step;
    Node(int row , int col , int step){
        this.row=row;
        this.col=col;
        this.step=step;
    }
}
public class DistanceOfNearestCellHaving1 {

	static int[][] nearest(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m  = grid[0].length;
        
        int visit[][]= new int[n][m];
        int dist[][]= new int[n][m];
        Queue<Node> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new Node(i,j,0));
                    visit[i][j]=1;
                    
                }
            }
        }
        int delrow[]= new int[]{-1,0,+1,0};
        int delcol[]= new int[]{0,+1,0,-1};
        
        while(!q.isEmpty()){
            int r= q.peek().row;
            int c= q.peek().col;
            int s= q.peek().step;
            q.remove();
            dist[r][c]=s;
            
            for(int i=0;i<4;i++){
                int nrow = r+delrow[i];
                int ncol = c+delcol[i];
                if(nrow>=0 && nrow <n && ncol>=0 && ncol<m
                && visit[nrow][ncol]==0){
                    visit[nrow][ncol]=1;
                    q.add(new Node(nrow, ncol , s+1));
                }
            }
        }return dist;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub{{1,0,1},{1,1,0},{1,0,0}}
		//int grid[][]= new int [][]{{0,1,1,0},{1,1,0,0},{0,0,1,1}};
		int grid[][]= new int [][]{{1,0,1},{1,1,0},{1,0,0}};
		int dis[][]= nearest(grid);
		for(int i=0;i<dis.length;i++) {
			for(int j=0;j<dis[0].length;j++) {
				System.out.print(dis[i][j]);
			}System.out.println();
		}

	}

}
