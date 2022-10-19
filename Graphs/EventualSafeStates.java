package Graphs;
import java.util.*;

public class EventualSafeStates {
	static boolean dfs(int node , List<List<Integer>> adj , int visit[] , int placeVisit[],int check[] ){
        visit[node]=1;
        placeVisit[node]=1;
        check[node]=0;
        
        for(Integer it : adj.get(node)){
            if(visit[it]==0){
                if(dfs(it , adj , visit,placeVisit,check) ==true) return true;
            }else if(placeVisit[it]==1){
                return true;
            }
        }
        placeVisit[node]=0;
        check[node]=1;
        return false;
    }
    static List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        int visit[]=new int[V];
        int placeVisit[]=new int[V];
        int check[]=new int[V];
        
        for(int i =0;i<V;i++){
            if(visit[i]==0){
                dfs(i , adj, visit, placeVisit , check);
            }
        }
        List<Integer>res = new ArrayList<>();
        for(int i =0;i<V;i++){
            if(check[i]==1){
                 res.add(i);
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call above funciton 
		// the main idea behind this problem is detect nodes which are in a cycle and which are entering into cycle 
		// eleminate those cycles and print the rest of the nodes

	}

}
