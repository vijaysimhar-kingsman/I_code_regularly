package Infosys;

import java.util.*;
public class BirthDayGiftArray {

	public static void main(String[] args) {
		
		//logic 1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long val = (n*(n+1)/2) -((n-k)*(n-k+1)/2);
		System.out.println(val%10000);
//		/*we applied kadanes algorith here : simply we are calculating
//		  all possible ways of  combinations and substracting combinations
//		  which are greatere than the length sepecified */
//		
//		//logic 2
//		long val2 = n;
//		for(int i=1;i<k;i++) {
//			//val2+=(n-i+1)*(n-i)/2;
//		}
//		System.out.println(val2);
		
	}

}
