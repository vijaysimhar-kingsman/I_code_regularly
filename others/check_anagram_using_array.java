import java.util.Arrays;
import java.util.Scanner;

public class check_anagram_using_array {
	
	public static boolean anagram(String s1 , String s2) {
		//System.out.println("entered");
		//fuck this fucking logic less piece of shit code 
		/*if(s1.length()!=s2.length()) {
			return false;
		}else {
			char c1[]= s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1,c2);
			
		}*/
		if(s1.length()!=s2.length()) {
			return false;
		}else {
			int arr[]= new int[26];//because there are 26 alphabets
			
			for(int i=0;i<s1.length();i++) {
				arr[s1.charAt(i)-'a']++;
				arr[s2.charAt(i)-'a']--;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					return false;
				}
			}
		}return true;
		
		
	}

	public static void main(String[] args) {
		
		/*Scanner sc =  new Scanner(System.in);
		System.out.println("enter string 1 : ");
		String s1 = sc.nextLine();
		System.out.println("enter string 2 : ");
		String s2 = sc.nextLine();*/
		String str1[]= new String[] {"viajy","vj","ab"};
		String str2[]= new String[] {"vijay","jv","jayvi","ijavy"};
		
		for(int i =0;i<str1.length;i++) {
			System.out.print(str1[i]+" ");
		}
		System.out.println();
		
		for(int i =0;i<str2.length;i++) {
			System.out.print(str2[i]+" ");
		}
		System.out.println();
		
		int a[]=new int[str1.length];
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(anagram(str1[i],str2[j])) {
					a[i]++;
				}
			}
		}
		/*if(anagram(s1,s2)) {
			System.out.println("yes the strings are anagrams");
		}else {
			System.out.println("not the strings are not anagrams");
		}*/
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
