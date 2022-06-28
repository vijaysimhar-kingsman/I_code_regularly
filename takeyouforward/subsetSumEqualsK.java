package takeyouforward;
import java.util.*;
public class subsetSumEqualsK {
	
	    
	    static void subsetSumEqualsToK(int ind , int target ,int arr[], ArrayList<ArrayList<Integer>> result ,ArrayList<Integer> ds ){
	            if(ind == arr.length){
	                if(target==0){
	                    result.add(new ArrayList<>(ds));
	                }
	                return;
	            }
	            //the below code will take one element one or more times
//	            if(arr[ind] <= target){
//	                ds.add(arr[ind]);
//	                subsetSumEqualsToK(ind,target-arr[ind],arr,result , ds);    
//	                ds.remove(ds.size()-1);
//
//	                
//	            }
//	            subsetSumEqualsToK(ind+1,target,arr,result , ds);    
	            
	            //the below code will take one element one  time
	            
	            if(arr[ind] <= target){
	                ds.add(arr[ind]);
	                subsetSumEqualsToK(ind+1,target-arr[ind],arr,result , ds);    
	                ds.remove(ds.size()-1);

	                
	            }
	            subsetSumEqualsToK(ind+1,target,arr,result , ds);  

	        }
	    public static void main(String args[]){
	         int arr[]= new int[] {2,1,4,5,1,3};
	        // Write your code here.
	         int k =7;
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        //ArrayList<Integer> ds =new ArrayList<>();
	        subsetSumEqualsToK(0,k,arr,result , new ArrayList<>());
	        System.out.println(result);
	    }
	
}
