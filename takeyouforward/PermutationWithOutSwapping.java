package takeyouforward;
import java.util.*;
public class PermutationWithOutSwapping {
	
	    static void permutations(int nums[],List<List<Integer>> ans ,List<Integer> ds ,boolean freq []){
	        if(ds.size()==nums.length){
	            ans.add(new ArrayList<>(ds));
	            return;
	        }
	        for(int i=0;i<nums.length;i++){
	            if(!freq[i]){
	                freq[i]=true;
	                ds.add(nums[i]);
	                permutations(nums,ans,ds,freq);
	                ds.remove(ds.size()-1);
	                freq[i]=false;
	            }
	        }
	        
	    }
	    static List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> ans = new ArrayList<>();
	        List<Integer> ds = new ArrayList<>();
	        boolean freq []= new boolean[nums.length];
	        permutations(nums,ans,ds,freq);
	        return ans;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n = sc.nextInt();
		int nums[]= new int[n];
		for(int i =0;i<n;i++) {
			System.out.println("enter element : ");
			nums[i]= sc.nextInt();
		}
		System.out.println(permute(nums));
		

	}

}
