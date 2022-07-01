package takeyouforward;
import java.util.*;
public class PermutationSequence {
	
	    /*
	    BRUTE FORCE APPROACH
	    
	    static void swap(StringBuffer s , int l ,int r){
	        
	        String temp = s.substring(l,l+1);
	        if(r!=s.length()-1){
	            s.replace(l,l+1 ,s.substring(r,r+1));
	            s.replace(r,r+1,temp);
	        }else{
	            
	            s.replace(l,l+1 ,Character.toString(s.charAt(r)));
	            s.deleteCharAt(r);
	            s.append(temp);
	        }
	        
	    }
	    static void permut(int l , StringBuffer s,ArrayList<String> ss){
	        if(l == s.length()-1){
	            
	            ss.add(s.toString());
	            //System.out.println(s);
	        }
	        for(int i=l;i<s.length();i++){
	            swap(s,l,i);
	            
	            permut(l+1,s,ss);
	            swap(s,l,i);
	        }
	    }
	    public String getPermutation(int n, int k) {
	        ArrayList<String> ss = new ArrayList<>();
	        StringBuffer s = new StringBuffer();
	        
	        for(int i =1;i<=n;i++){
	            s.append(i);
	        }
	        permut(0,s,ss);
	        //System.out.println(ss);
	        Collections.sort(ss);
	        return ss.get(k-1);
	        
	    }*/
	    static int fact(int n){
	        if(n==1) return 1;
	        else return n*fact(n-1);
	    }
	    static void getKthPermutation(int n ,int k, StringBuffer s , ArrayList<Integer> arr){
	        if(arr.size()==1){
	            s.append(arr.get(0));
	            return;
	        }int fact_val =fact(n-1);
	        int x = k/fact_val;
	        s.append(arr.get(x));
	        arr.remove(x);
	        k=k%fact_val;
	        getKthPermutation(n-1,k,s,arr);

	    }
	    static String getPermutation(int n, int k) {
	        ArrayList<Integer> arr = new ArrayList<>();
	        for(int i =0;i<n;i++){
	            arr.add(i+1);
	        }
	        StringBuffer s = new StringBuffer("");
	        getKthPermutation(n,k-1,s,arr);
	        return s.toString();
	        
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n = sc.nextInt();
		System.out.println("enter which permutation you want : ");
		int k = sc.nextInt();
		System.out.println(getPermutation(n,k));
	}

}
