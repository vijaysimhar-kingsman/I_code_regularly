package takeyouforward;
import java.util.*;
import java.lang.*;

public class stock_graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stockPrices[][] = new int [][] {{1,1000000000},{1000000000,1000000000},{999999999,1},{2,999999999}};
		//]{{1,7},{2,6},{3,5},{4,4},{5,4},{6,3},{7,2},{8,1}};
		int n = stockPrices.length;
		int m = stockPrices[0].length;
		
		/*for (int i = 0; i < n - 1; i++){
		     
            for (int j = 0; j < n - i - 1; j++){
                if (stockPrices[j][0] > stockPrices[j + 1][0]) {
                     int temp[] = stockPrices[j];
                     stockPrices[j] = stockPrices[j + 1];
                     stockPrices[j + 1] = temp;
                    
                }
            }
        }*/
		int present_m=0;
		int previous_m=-110;
		int c=0;
		
		for (int i = 0; i < n - 1; i++){
		     int del_y=Math.abs(stockPrices[i+1][1]-stockPrices[i][1]);
		     System.out.println("stocks "+stockPrices[i+1][1]+" "+stockPrices[i][1]);
		     int del_x=Math.abs(stockPrices[i+1][0]-stockPrices[i][0]);
		     System.out.println("dels : "+del_y+" "+del_x);
		     present_m=del_y/del_x;
		     System.out.println(present_m+" "+previous_m);
		     if(present_m != previous_m) {
		    	 c++;
		    	 previous_m=present_m;
		     }
            
        }System.out.println(c);
		
    
	}

}
 