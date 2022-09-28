import java.util.*;
public class xor_pal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner ss = new Scanner(System.in);
		
		//System.out.println("iterations : " );
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	    	//System.out.println("size : ");
	        int sz= sc.nextInt(); //size
	        
			//System.out.println("enter string : ");
	        sc.nextLine();
	        String s = sc.nextLine();
	       

			
	        //System.out.println("enter string : ");
			int count=0; int j=0; int k=sz-1;
			while(j<k){ 
				if(s.charAt(j)==s.charAt(k)){
			  
				}else{ 
					count++;
				} j++; k--; 
			}System.out.println(count); 
		}
			 

	}

}
