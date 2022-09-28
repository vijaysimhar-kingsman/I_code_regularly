package MultiThreading;
class NegativeDimensionExp extends Exception{
	@Override
	public String toString() {
		return "you should not give negative dimensions";
	}
}
public class ThrowAndThrows {
	static int area(int l , int b ) throws NegativeDimensionExp { // throws saying that this method can pass an exception 
		if(l<0 || b < 0) {
			throw new NegativeDimensionExp(); //here it passes the exception 
		}
		return l*b;
	}
	static void  method1() throws NegativeDimensionExp { // the above passed exception is passed to below method which called it
		System.out.println(area(-10,2));
	}
	static void method2() throws NegativeDimensionExp{ // similarly it goes on hirarchially
		method1();
	}static void method3() throws NegativeDimensionExp {
		method2();
	}
	public static void main(String[] args) throws NegativeDimensionExp { // here eiter we can handle the exception or else we can pass it to JVM
		// if we pass it to JVM it displays the message as error
		// TODO Auto-generated method stub
		try {
			method3();
		}catch(Exception e) {
			System.out.println(e);
		}//we can handle this exception in the above methods also or we can skip just by mentioning throws exception_name
	}

}
