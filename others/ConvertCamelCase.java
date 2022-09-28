package others;
import java.util.*;
public class ConvertCamelCase {
    	public static void main(String[] args) {
	/*	String s= "oneTwoThreeFourFive";
		int flag=0;
		StringBuffer ss = new StringBuffer("");
		for(int i=0;i<s.length();i++) {
			if(flag==0 && Character.isUpperCase(s.charAt(i))) {
				System.out.println(s.substring(0,i).toUpperCase());
				flag=1;
				ss.delete(0,ss.length());
				ss.append(Character.toLowerCase(s.charAt(i)));
			}else {
				if(Character.isLowerCase(s.charAt(i))) {
					ss.append(Character.toUpperCase(s.charAt(i)));
				}else {
					System.out.println(ss);
					ss.delete(0,ss.length());
					ss.append(Character.toLowerCase(s.charAt(i)));
				}
			}
		}System.out.println(ss);*/
    		//can be done simply 
    		Scanner sc = new Scanner(System.in);
    		String s = sc.nextLine();
    		for(int i =0;i<s.length();i++) {
    			if(Character.isUpperCase(s.charAt(i))) {
    				System.out.println();
    				System.out.print(Character.toLowerCase(s.charAt(i)));
    				
    			}else {
    				System.out.print(Character.toUpperCase(s.charAt(i)));
    			}
    		}
	}

}
