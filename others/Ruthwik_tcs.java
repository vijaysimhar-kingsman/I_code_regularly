package others;
import java.util.*;
public class Ruthwik_tcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter : ");
		int n = sc.nextInt();
		System.out.println("enter : ");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.println("enter : ");
		String s = sc.nextLine();
		int [][]arr = new int[n][m];
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int a = i;
				int b =j;
				int k=0;
				int count=0;
				while((a>=0 && a<n ) && (b>=0 && b<m) && k<s.length() && flag!=1) {
					if(s.charAt(k)=='L') b--;
						
					else if(s.charAt(k)=='R') b++;
						
					else if(s.charAt(k)=='F') a--;
							
					else if(s.charAt(k)=='B')a++;
					
					k++;
					count++;

				}if(count == s.length() && (a>=0 && a<n ) && (b>=0 && b<m) ) {
					System.out.println("Safe");
					flag=1;
				}
			}
		}if(flag==0) {
			System.out.println("Unsafe");
		}
	}

}
