package Graphs;
import java.util.*;
public class CycleDetectionInDirectdGraph {
	static boolean dfsCheck(int node ,ArrayList<ArrayList<Integer>> adj ,
		int visit[],int pathVisit[]){
        visit[node]=1;
        pathVisit[node]=1;
        
        for(Integer it : adj.get(node)){
            if(visit[it]!=1){
                if(dfsCheck(it , adj , visit , pathVisit)==true) return true;
            }else if(pathVisit[it]==1){
                return true;
            }
        }pathVisit[node]=0;
        return false;
    }
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int visit[]= new int[V];
        int pathVisit[]=new int[V];
        
        for(int i=0;i<V;i++){
            if(visit[i]!=1){
                if(dfsCheck(i,adj, visit , pathVisit) ==true) return true;
                
            }
        }return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call isCycle by passing directed adjacent arraylist
	}

}
