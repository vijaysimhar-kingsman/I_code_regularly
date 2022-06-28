package codestudios;
import java.util.*;
public class n_minus_m {

	
	    static void callfun(int n, int k ,int c,int i,int val,List<Integer> l ){
	        //callfun(n,k,0,n,0,l);
	        
	        if(c==0){
	            val -=k*i;
	            i++;
	            l.add(val);
	            System.out.print(val+" ");
	            if(c<0){
	                i=1;
	                c=1;
	                
	            }callfun(n,k,c,i,val,l);
	            
	        }else if(c==1){
	            val+=k*i;
	            l.add(val);
	            System.out.print(val+" ");
	            if(val>n){
	                 c=2;
	                return;
	               
	            }
	            callfun(n,k,c,i,val,l);
	            
	        }return;
	        
	        
	        
	    }
	    public static List<Integer> main(String args[]) {
	        // Write your code here
	    	int n=5,k=2;
	        ArrayList<Integer> l = new ArrayList<>();
	        int val;
	        callfun(n,k,0,n,0,l);
	        System.out.println(l);
	        return l;
	    }
	
	
	
}
