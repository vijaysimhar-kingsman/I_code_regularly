package Graphs;
import java.util.*;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lets say we are given with data in a list of list and n value
		
		int n=10;
		int adj[][]=new int[n+1][n+1];
		
		int visit[]= new int[n+1];
		
		ArrayList<Integer> bfs = new ArrayList<>();
		
		Queue<Integer>  q = new LinkedList<>();
		
		q.add(0);
		while(!q.isEmpty()) {
			Integer node = q.poll();
			bfs.add(node);
			
			for(int x : adj[node]) {
				if(visit[x]!=1) {
					visit[x]=1;
					q.add(x);
				}
			}
//			for(Integer it : adj.get(node)) {
//				
//			}
		}System.out.println(bfs);
		

	}

}
