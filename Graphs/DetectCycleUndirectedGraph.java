package Graphs;
import Graphs.pair;
import java.util.*;
//USING BFS

public class DetectCycleUndirectedGraph {

	static boolean bfs(int node ,int visit[],ArrayList<ArrayList<Integer>> adj){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(node,-1));
        visit[node]=1;
        while(!q.isEmpty()){
            int nod = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for(Integer it : adj.get(nod)){
                if(visit[it]==0){
                    visit[it]=1;
                    q.add(new pair(it,nod));
                }else if(par != it){ 
                    return true;
                }
            }
        }return false;
    }
	static boolean dfs(int node , int parent , int visit[],ArrayList<ArrayList<Integer>> adj) {
		visit[node]= 1;
		for(Integer it : adj.get(node)) {
			if(visit[it]==0) {
				if(dfs(it,node , visit, adj)==true) return true;
			}else if(parent !=it) return true;
		}
		return false;
	}
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int visit[] = new int[V];
        for(int i =0;i<V;i++){
            if(visit[i]==0){
                if(bfs(i,visit, adj)) return true;
            }
        }return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
