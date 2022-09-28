
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>(10);
		al1.add(10);
		al1.add(0, 5);
		ArrayList<Integer> al2 = new ArrayList<>(List.of(11,12,13,14,15));
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al1.containsAll(al2));
		for(int i =0;i<al1.size();i++) {
			System.out.print(al1.get(i)+" - ");
		}//for each loop
		for(Integer x:al1) {
			System.out.println(x);
		}
		
		//iterators using while loop
		//iterators only traverse in forward direction 
		
		 Iterator<Integer> it = al1.iterator(); while(it.hasNext()) {
		 System.out.print(it.next() + "- "); }
		 
		// list Iterator 
		ListIterator<Integer> itt = al1.listIterator();
		while(itt.hasNext()) {
			System.out.print(itt.next());
		}
		
		 //list iterator using for loop
		for(ListIterator<Integer> li =al1.listIterator() ; li.hasNext();) { 
			System.out.print(li.next()); 
		}
		 
	}

}
