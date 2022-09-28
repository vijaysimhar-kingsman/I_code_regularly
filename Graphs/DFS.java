package Graphs;
import java.util.*;
public class DFS {
	 static void dfs(int node , ArrayList<ArrayList<Integer>> adj, int visit[],  ArrayList<Integer> ds){
	        visit[node]=1;
	        ds.add(node);
	        for(Integer x : adj.get(node)){
	            if(visit[x]==0){
	                dfs(x, adj , visit , ds);
	            }
	        }
	    }
	    // Function to return a list containing the DFS traversal of the graph.
	    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
	        // Code here
	        int visit[]= new int[V];
	        int start =0;
	        ArrayList<Integer> ds = new ArrayList<>();
	        dfs(start , adj, visit , ds);
	        return ds;
	    }
	    public static void main(String[] args) {
	    	//call dfsOfGraph by sending a adj list
	    }
}
