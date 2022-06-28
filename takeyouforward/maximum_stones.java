package takeyouforward;

import java.util.Arrays;

public class maximum_stones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity[]=new int[]{2,3,4,5};
		int rocks[] = new  int[] {1,2,4,4};
		int n = capacity.length;
		

		int additionalRocks =2;
		
        for (int i = 0; i < n - 1; i++){
     
            for (int j = 0; j < n - i - 1; j++){
                if (capacity[j] > capacity[j + 1]) {
                     int temp = capacity[j];
                     capacity[j] = capacity[j + 1];
                     capacity[j + 1] = temp;

                     int temp2  =   rocks[j];
                     rocks[j]   = rocks[j+1];
                     rocks[j+1] = temp2;
                    
                    
                }
            }
        }
        
		 System.out.printf("\n");
		 int arr[]=new int[n];
        for(int i=0;i<n;i++) {
			System.out.printf("%d \n",capacity[i]-rocks[i]);
			arr[i]=capacity[i]-rocks[i];
			
		}Arrays.sort(arr);
        for(int i=0;i<n;i++) {
			System.out.printf("arr %d \n",arr[i]);
			
			
		}int c=0;
		
		for(int i=0;i<n;i++) {
			if(additionalRocks-arr[i]>=0) {
				c++;
				additionalRocks-=arr[i];
			}else {
				break;
			}
			
		}System.out.println(" answer : "+ c);
        /*for(int i=0;i<n;i++){
            if(capacity[i]>rocks[i]){
                int can_place = capacity[i]-rocks[i];
                additionalRocks-=can_place;
                if(additionalRocks<0){
                    break;
                }else{
                    rocks[i]=capacity[i];
                    if(additionalRocks ==0){
                        break;
                    }
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(capacity[i]==rocks[i]){
                c++;
            }
        }System.out.println(" answer : "+ c);*/
    

	}

}
