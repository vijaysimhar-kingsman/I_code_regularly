
public class find_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"1","9","5","11","2","3","8"};
		
		for(int i =0;i<a.length;i++){
			int val = Integer.parseInt(a[i]);
			if(val%2==0) {
				System.out.println(val +" is a even number and its index is "+ i );
			}
		}
		//String s ="vijay";
		//System.out.println(s.substring(4,5));
	}

}
