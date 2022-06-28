package takeyouforward;

import java.util.*;

public class pascal_triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> past_list = new ArrayList<>();
		ArrayList<Integer> pre_list = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<=i;j++) {
					if(j==0 || j==i) {
						pre_list.add(1);
					}else {
						pre_list.add(past_list.get(j-1)+past_list.get(j));
					}
				}
				
				past_list=pre_list;
				res.add(pre_list);
				pre_list.clear();
			}
		}

		
	}


