package takeyouforward;

public class percentage_of_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "fooder";
		char letter ='o';
		int l = s.length();
        int c=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)==letter){
                c++;
            }
        }int percentage = (c *100/ s.length());
        System.out.println(percentage);
        System.out.println(c);

	}

}
