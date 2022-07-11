package takeyouforward;
import java.util.*;
public class PickNotPick {
	static void pick(int ind , int arr[], int count , List<List<Integer>> al,List<Integer> ds,int sum){
		if( count == 3 || ind == arr.length){
			if(count == 3) {
				if(ds.get(0)+ds.get(1)+ds.get(2)==sum){
					al.add(new ArrayList<>(ds));
				}
				
				//System.out.println(ds);
				
			}return;
		}
		ds.add(arr[ind]);
		pick(ind , arr, count+1,al,ds,sum);
		ds.remove(ds.size()-1);
		//System.out.println("inside");
		pick(ind+1 , arr, count,al,ds,sum);
	}
	public static void main(String[] args) {
	
		int n =2;
		int arr[]= new int[n+1];
		int xorr[]= new int[] {4,7,2};
		for(int i =0;i<=n;i++) {
			arr[i]=i;
		}
		List<List<Integer>> al= new ArrayList<>();
		//ArrayList<Integer> ds= new ArrayList<>();
		int sum =xorr[0];
		pick(0,arr,0,al,new ArrayList<>(),sum);
		System.out.println(al);
		int i=0,j=1;
		int flag=0;
		//int gotIt=-1;
		while(j<xorr.length && i<al.size()){
			int x =al.get(i).get(0)^j;
			int y=al.get(i).get(1)^j;
			int z =al.get(i).get(2)^j;
			if((x + y + z) == xorr[j]) {
					j++;
					flag++;	
					//System.out.println("arr = " + al.get(i) + " value = "+ xorr[j]);
			}else{
				j=1;
				i++;
				flag=0;
			}
			//System.out.println("getting in "+  al.get(i));
		}System.out.println(al.get(i));
		
		
		
		
	}

}
