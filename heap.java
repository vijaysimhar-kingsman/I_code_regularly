
/*class mycom implements Comparator<Integer>{
    public int compare(Integer o1 , Integer o2){
        if(o1<o2) return 1;
        if(o2<o1) return -1;
        return 0;
    }

}*/

import java.util.*;

public class heap {
	//we are discusing about max heap , its defaultly min heap without that comoare function

	public static void main(String []args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(20);
		pq.add(10);
		pq.add(30);
		
		pq.add(5);
		pq.add(15);
		pq.add(12);
		pq.add(3);
		
		pq.forEach((x)->System.out.println(x));
		
	}
}
