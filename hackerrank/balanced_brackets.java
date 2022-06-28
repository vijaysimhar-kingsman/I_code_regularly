package hackerrank;
import java.util.*;
public class balanced_brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="{([])}";
		Stack<Character> st = new Stack<Character>();
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='('|| ch=='{' ||ch=='[') {
				st.push(ch);
			}else {
				if(st.isEmpty()) {
					System.out.print("no");
					break;
				}else {
					char ch2 = st.peek();
					if(ch2=='(' && ch!=')') {
						System.out.print("no");
						break;
					}else if(ch2=='[' && ch!=']') {
						System.out.print("no");
						break;
					}else if(ch2=='{' && ch!='}') {
						System.out.print("no");
						break;
					}else {
						st.pop();
					}
					
				}
			}
		}if(st.isEmpty()) {
			System.out.print("yes");
			
		}
	}

}
