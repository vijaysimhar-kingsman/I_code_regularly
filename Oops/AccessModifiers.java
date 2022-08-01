package Oops;

class Modifiers{
	public String name;
	protected String email;
	private String password;
	public String getPassword() {
		return this.password;
	}public void setPassword(String password) {
		this.password = password;
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers m1 =new  Modifiers();
		m1.name = "vijay";
		System.out.println(m1.name); //accessed 
		m1.email = "vijaysimhareddy@gmail.com"; //accessed
		System.out.println(m1.email);
		//m1.password="asdf";
		//System.out.println(m1.password); ERROR
		
		// we can access private properties using getters and setters
		m1.setPassword("asdffsad");
		System.out.println(m1.getPassword());
		



	}

}
