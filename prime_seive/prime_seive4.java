package prime_seive;

import java.util.*;
//print prime factors -  shortest prime factors

public class prime_seive4 {
	
	static int N = 1000000;
	static int spf[]= new int[N+1];
	static void primeSeive() {
		for(int i=1;i<=N;i++) {
			spf[i]=i;
		}
		for(int i=2;i<=N;i++) {
			if(spf[i]==i) {
				for(int j = i*i ;j<=N;j++) {
					if(spf[j]==j) {
						spf[j]=i;
					}
				}
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeSeive();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=1) {
			System.out.println(spf[n]);
			n=n/spf[n];
		}

	}

}
