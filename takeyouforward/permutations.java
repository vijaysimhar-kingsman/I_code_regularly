package takeyouforward;
import java.util.*;
public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= new int[]{1,2,3};
		List<List<Integer>> ans = new ArrayList<>();
		permut(0,nums,ans);
		
		System.out.println(ans);
	

	}static void permut(int index , int nums[] , List<List<Integer>> ans){
		if(index == nums.length) {
			List<Integer> p = new ArrayList<>();
			for(int i=0;i<nums.length;i++) {
				p.add(nums[i]);
			}
			ans.add(new ArrayList<>(p));
			return;
		}for(int i=index;i<nums.length;i++) {
			swap(index,i,nums);
			permut(index+1 , nums, ans);
			swap(index, i,nums);
		}
	}static void swap(int index , int i, int nums[]) {
		int temp = nums[index];
		nums[index]= nums[i];
		nums[i]=temp;
	}

}
