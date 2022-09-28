package prime_seive;

//check weatehr a number is prime or not	
import java.util.Scanner;

public class prime_seive1 {
	static int N = 1000000;
	static int seive[]= new int[N+1];
	static void primeSeive() {
		for(int i=2;i<=N;i++) {
			seive[i]=1;
		}
		for(int i=2;i*i<=N;i++) {
			
			for(int j = i*i ;j<=N;j+=i) {
				
					seive[j]=0;
				
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeSeive();
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(seive[n]==1) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
			
	}
}
