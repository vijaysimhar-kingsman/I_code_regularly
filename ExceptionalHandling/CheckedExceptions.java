package ExceptionalHandling;
//creating our own exception by inheriting exception class
class LowBalanceException extends Exception{
	@Override
	public String toString() {
		return "you must have 5000 rupees in your account";
	}
}
public class CheckedExceptions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 14999;
		try {
			if(balance >=5000) {
				System.out.println("you are maintaining good balance");
			}else {
				throw new LowBalanceException();
			}
			
		}catch(LowBalanceException e) {
			System.out.println(e);
		}
		
	}

}
