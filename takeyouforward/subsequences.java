package takeyouforward;
import java.util.*;
public class subsequences {
	//this code is to print all the subsequences of the given array
	static void printSubsequences(int ind , int arr[],ArrayList<Integer>al) {
		if(ind == arr.length) {
			System.out.println(al);
			return;
		}
			al.add(arr[ind]);
			printSubsequences(ind+1,arr,al);
			al.remove(al.size()-1);
			printSubsequences(ind+1,arr,al);
	}
	//this code is to print the subsequences of array whose sum is equlas to k
	static void kSum(int ind ,int arr[],ArrayList<Integer> al ,int k , int sum){
		if(ind==arr.length) {
			if(sum==k) {
				System.out.println(al);
				return;
			}else return;
		}
		al.add(arr[ind]);
		sum+=arr[ind];
		kSum(ind+1,arr,al,k,sum);
		
		al.remove(al.size()-1);
		sum-=arr[ind];
		kSum(ind+1,arr,al,k,sum);
		

		
	}//this code returns only one subsequence that matched the sum with k
	static boolean oneKsum(int ind ,int arr[],ArrayList<Integer> al ,int k , int sum) {
		if(ind ==arr.length) {
			if(sum==k) {
				System.out.println(al);
				return true;
				//return false; this will print all the subsequnces with sum k
			}return false;
		}
		al.add(arr[ind]);
		sum+=arr[ind];
		if(oneKsum(ind+1,arr,al,k,sum)==true) return true;
		
		al.remove(al.size()-1);
		sum-=arr[ind];
		if(oneKsum(ind+1,arr,al,k,sum)==true) return true;
		
		
		
		return false;
	}static int kSumCount(int ind ,int arr[] ,int k , int sum){
		if(ind==arr.length) {
			if(sum==k) {
				
				return 1;
			}else return 0;
		}
		
		sum+=arr[ind];
		int l=kSumCount(ind+1,arr,k,sum);
		
		
		sum-=arr[ind];
		int r=kSumCount(ind+1,arr,k,sum);
		
		return l+r;
		
	}
	//this code will return the count of number of subsequecnes whose sum is k
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= new int[]{2,1,3,1,4}; 
		ArrayList<Integer> list = new ArrayList<>();
		// int n =3;
		//f(0,arr,list,2,0);
		printSubsequences(0,arr,list);
		//int k=4;
		//kSum(0,arr,list,k,0);
		//oneKsum(0,arr,list,k,0);
		//Integer count=0;
		//int res =kSumCount(0,arr,k,0);
		//System.out.println(res);
		
	}
	
}
	/*static void f(int ind  ,int a[]  ,ArrayList<Integer> list,  int k,int sum){
    if(ind==a.length){
        if(k==sum){
        System.out.println(list);
        }
        return ;
    }
    //take
    list.add(a[ind]);
    sum+=a[ind];
    f(ind+1,a,list,k,sum);
    
    list.remove(list.size() - 1);
    sum-=a[ind];
    f(ind+1,a,list,k,sum);
    
	}*/

