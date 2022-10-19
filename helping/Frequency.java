package helping;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string : ");
		String s = sc.nextLine();
		Map<Character , Integer> map = new HashMap<>();
		
		for(int i =0;i<s.length();i++){
			
			if(map.get(s.charAt(i))==null) { // checking weather the character is present or not  
				
				map.put(s.charAt(i), 1); // if null that means not present we are updating to char coun 1
			}
			else {
				
				map.put(s.charAt(i), map.get(s.charAt(i))+1); // if already present we are incrementint by one
			}
		}
		char a='1';
		int counta=0;
		char b='2';
		int countb=0;
		boolean result =true;
		
		for (Map.Entry<Character,Integer> entry : map.entrySet()) {  
			if(a=='1' || a==entry.getKey()) {
				a= entry.getKey();
				counta++;
			}else if(b=='2' || b==entry.getKey() ) {
				b=entry.getKey();
				countb++;
			}else {
				result=false;
				break;
			}
				
		}
		if(counta<countb)
		if(s.length()==map.size() || s.length()==map.size()-1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(map);

	}

}
