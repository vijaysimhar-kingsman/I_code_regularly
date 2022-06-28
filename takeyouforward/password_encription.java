package takeyouforward;
import java.util.*;
import java.lang.*;
public class password_encription {
	public static String decryptPassword(String s) {
	    // Write your code here
	        StringBuffer ss = new StringBuffer(s);
	        int i=0;
	        while(i<s.length()){
	        	int c=0;
	            if(Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i+1))){
	                char ch= s.charAt(i);
	                
	                //ss.insert(i, ss.charAt(i+1));
	                ss.replace(i+c,i+1+c,s.substring(i+1,i+2));
	                ss.replace(i+1+c,i+2+c,String.valueOf(ch));
	                //ss.insert(i+1, ch);
	                char star ='*';
	                ss.insert(i+2+c,star);
	                c++;
	                System.out.println(i+" 1 "+ ss);
	                i=i+2;
	                
	                
	            }if(Character.isDigit(s.charAt(i))){
	                //ss.replace(0,1,String.valueOf(ss.charAt(i)));
	            	ss.insert(0,s.charAt(i) );
	                // zero="0";
	            	c++;
	                ss.replace(i+c,i+1+c, "0");
	                System.out.println(i+" 2 "+ ss);
	                i=i+1;
	            }else{
	            	 System.out.println(i+" 3 "+ ss);
	                i=i+1;
	               
	            }
	        }
	        String sss= ss.toString();
	        ss.setLength(0);
	        System.out.println(sss);
	        return sss;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =decryptPassword("hAck3rr4nk");
		System.out.println(s);
	}

}
