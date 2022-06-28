package takeyouforward;

public class kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//highest sum of subsequence 
		
		int nums[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int k=0,l=0;
	    int i=0;
	    int max=-100;
	    int sum=0;
	    
		while(i<nums.length){
	        sum+=nums[i];
	        if(max<sum){
	            max=sum;
	            l=i;
	        }
	        
	        if(sum<=0){
	            sum=0;
	            k=i+1;
	        }
	        i++;
		}System.out.println(max);
		for(i=k;i<=l;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
