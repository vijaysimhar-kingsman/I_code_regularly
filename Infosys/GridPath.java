package Infosys;
import java.util.*;
public class GridPath {
	static int pathSum(int arr[][],int i,int j,int sum) {
		if(i>=arr.length-1) {
			return 0;
		}
		
		if(Math.max(arr[i+1][0], arr[i+1][1])>arr[i][j]) {
			int flag=0;
			if(arr[i+1][0]>arr[i+1][1]) {
				sum+=arr[i+1][0];
			}else {
				sum+=arr[i+1][1];
				flag=1;
			}
			pathSum(arr,i+1,flag,sum);
		}return sum;

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n*2;i++) {
			arr[i/2][i%2]=sc.nextInt();
		}
//		for(int i=0;i<n*2;i++) {
//			System.out.print(arr[i/2][i%2]+" ");
//		}
		int sum=0;int dummy=arr[0][0];
		sum=Math.max(sum,pathSum(arr,0,0,dummy));
		dummy =arr[0][1];
		sum=Math.max(sum,pathSum(arr,0,1,dummy));
		System.out.println(sum);
		
	}

}
