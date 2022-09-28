package takeyouforward;

import java.util.ArrayList;


public class Hash_tcs {
	static void HashSum(int ind ,int arr[],ArrayList<Integer> al ,int k , int sum ,int leng,ArrayList<ArrayList<Integer>> res){
		if(ind==arr.length) {
			if(sum==k && al.size()==leng ) {
				res.add(al);
				return;
			}else return;
		}
		al.add(arr[ind]);
		sum+=arr[ind];
		HashSum(ind+1,arr,al,k,sum ,leng,res);
		
		al.remove(al.size()-1);
		sum-=arr[ind];
		HashSum(ind+1,arr,al,k,sum,leng,res);
		

		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26}; 
		ArrayList<Integer> lis = new ArrayList<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int s =19;
		int l =5;
		//kSumCount(0,arr,l,lis,s,0);
		HashSum(0, arr ,lis,s , 0,l,res);
		System.out.println(res.size());

	}

}
