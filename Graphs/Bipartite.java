package Graphs;
import java.util.*;
public class Bipartite {
	static boolean bfs(int node ,ArrayList<ArrayList<Integer>>adj , int color[]){
        Queue<Integer> q  = new LinkedList<>();
        q.add(node);
        color[node]=0;
        while(!q.isEmpty()){
            int nod = q.peek();
            q.remove();
            for(Integer it : adj.get(nod)){
                if(color[it]==-1){
                    color[it]=1-color[nod];
                    q.add(it);
                }else if(color[it]== color[nod]){
                    return false;
                }
            }
        }return true;
    }
	static  boolean dfs (int node , int c ,ArrayList<ArrayList<Integer>>adj,int []color) {
		color[node]=c;
		
		for(Integer it : adj.get(node)){
			if(color[it]==-1) {
				if(dfs(it , 1-c ,adj,color)==false) return false;
			}else if(color[it]==c) {
				return false;
			}
		}
		return true;
	}
	public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[]= new int[V];
        Arrays.fill(color ,-1);
        for(int i =0;i<V;i++){
            if(color[i]==-1){
                if(bfs(i, adj, color)==false){
                    return false;
                }
            }
//            if(color[i]==-1){
//                if(dfs(i, 0 ,adj, color)==false){
//                    return false;
//                }
//            }
        }return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pass adjacent matrix to isBipartite method
	}

}
