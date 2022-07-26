package Infosys;
import java.util.*;
public class Monsters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int exp=sc.nextInt();
		List<Integer> power= new ArrayList<>();
		List<Integer> bonus= new ArrayList<>();
		//System.out.println("input powers");
		for(int i=0;i<n;i++) {
			power.add(i,sc.nextInt());
		}
		//System.out.println("input bonus");
		for(int i=0;i<n;i++) {
			bonus.add(i,sc.nextInt());
		}
		System.out.println("powers"+ power);
		System.out.println("bonus"+bonus);
		int count =0;
		int i=0;
		for(i =0;i<n;i++) {
			int val=Collections.min(power);
			if(exp>=val) {
				count++;
				int ind=power.indexOf(val);
				exp +=bonus.get(ind);
				power.set(ind,Integer.MAX_VALUE);
			}else {
				System.out.println("no of monsters we can defeat : "+count);
				break;
			}
		}if(i==n) {
			System.out.println("no of monsters we can defeat : "+count);
		}
	}

}
