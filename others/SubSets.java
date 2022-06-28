package others;
import java.util.*;
public class SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int []{1,2,3,4};
		int n =4;
		int limit = (int)Math.pow(2, n);
		List<List<Integer>> al = new ArrayList<List<Integer>>();
		
		for(int i=0;i<limit;i++) {
			int temp = i;
			ArrayList<Integer> nn = new ArrayList<>();
			for(int j=n-1;j>=0;j--) {
				int r = temp%2;
				temp/=2;
				if(r==1) {
					nn.add(arr[j]);
				}
			}
			al.add(nn);
		}
		for(List x : al) {
			System.out.println(x);
		}
		

	}

}
