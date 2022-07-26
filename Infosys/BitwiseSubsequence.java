package Infosys;
import java.util.*;
public class BitwiseSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		int max=0;
		int count=0;
		//arr[0]=sc.nextInt();
		for(int i =0;i<n;i++){
			arr[i]=sc.nextInt();
		}//given that 1<x<n so we can loop from i =2 to i<n-1 
		//but simply im taking from 1 to N
		for(int i =1;i<n;i++){
			if(arr[i]>arr[i-1]) {
				int val1= arr[i];
				int val2 =arr[i-1];
				if((val1 & val2)*2 <(val1 | val2)) {
					if(count==0) count+=2;
					else count++;
					max= Math.max(count, max);
				}
			}else {
				count=0;
			}
		}
		System.out.println(max);

	}

}
