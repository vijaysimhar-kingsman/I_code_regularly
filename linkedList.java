
import java.util.*;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> al1 = new LinkedList<>();
		al1.add(10);
		al1.add(0, 5);
		al1.addFirst(1000);
		
		LinkedList<Integer> al2 = new LinkedList<>(List.of(11,12,13,14,15));
		al1.addAll(al2);
		al1.addLast(1234);
		al1.forEach(n->show(n));
		
				
	}
	static void show(int n){
		System.out.print(n+" - ");
	}
}
