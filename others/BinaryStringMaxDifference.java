package others;

/*input = 11010000100010
 * output  = 6
 * explanation  :  output should be maximum difference of zeros and ones ... atleast one 1 should be same
 * */
public class BinaryStringMaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s ="11010000100010";
		//String s = "0000011";
		//String s = "000101010";
		String s = "0000110000010011";
		int max_ind =0;
		int max_val =Integer.MIN_VALUE;
		int count=0;
		int val=0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)=='0') val++;
			else val--;
			if(count==0 && s.charAt(i)=='1') {
				count++;
			}
			if(count!=0) {
				if(max_val<=val) {
					max_val = Math.max(max_val, val);
					max_ind = Math.max(max_ind, i);
				}
				
				
			}
		}
		val=0;count=0;
		max_val=0;
		for(int i=max_ind;i>=0;i--) {
			if(s.charAt(i)=='0') val++;
			else val--;
			if(count==0 && s.charAt(i)=='1') {
				count++;
			}
			if(count!=0) {
				
				max_val = Math.max(max_val, val);
				
				
				
			}
		}
		System.out.println("there for the result is  : "+ max_val);
	}

}
