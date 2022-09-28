package ExceptionalHandling;

public class UnCheckedException {
	static void function3() {
		try {
			System.out.println(10/0);
			
		}catch(ArithmeticException a) {
			System.out.println(a);
		}
		catch(Exception e) {
			//System.out.println(e); // this will say what kind of exception and  the message
			System.out.println(e.getMessage()); 
			e.printStackTrace();
			
		}
	}
	static void function2() {
		function3();
	}
	static void function1() {
		function2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function1();
	}

}
