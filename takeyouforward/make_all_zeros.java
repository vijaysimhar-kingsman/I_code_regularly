package takeyouforward;

import java.util.*;
import java.lang.*;

public class make_all_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[]{2,3,3,4,5,6,2};
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			s.add(nums[i]);
		}
		
		int var=0;
		ArrayList<Integer> op = new ArrayList<>();
		int a[]= new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384/*, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608/*, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824*/};
		
		for(int i=0;i<a.length;i++) {
			op.add(a[i]);
		}
		System.out.println(s);
		Set<Integer> arr = new HashSet<>();
		for(Integer x :s) {
			if(op.contains(x)) {
				arr.add(x);
			}else if(x>0) {
				
				while(x!=0) {
					
					//
					if(arr.contains(x)) {
						break;
					}
					int min=Integer.MAX_VALUE;
					int val=0;
					
					for(int i=0;i<op.size();i++) {
						if(x-op.get(i)<min & op.get(i)<x) {
							min = x-op.get(i);
							val=op.get(i);
						}else {
							if(!arr.contains(val)) {
								arr.add(val);
								x-=val;
								i=32;
							}else {
								x-=val;
								i=32;//simply breaking;
							}
						}
					}
					
				}
			}
		}
		System.out.println(op);
		System.out.println(arr);
	}
	
	
	
			

}
