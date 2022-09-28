package ExceptionalHandling;

class OverLopadingException extends Exception{
	@Override
	public String toString() {
		return "Stack overflow";
	}
}
class stacks{
	int capacity=5;
	int data[]= new int[capacity];
	int top = 0;
	public void push(int val) throws OverLopadingException {
		try {
			if(top!=capacity) {
				data[top]=val;
				top++;
			}else {
				throw new OverLopadingException();
			}
		}catch(OverLopadingException e) {
			System.out.println(e);
		}
		
	}public void pop( ) throws OverLopadingException{
		try {
			if(top>=0) {
				data[top]=0;
				top--;
			}else {
				throw new OverLopadingException();
			}
		}catch(OverLopadingException e) {
			System.out.println(e);
		}
	}
	
	
}
public class ExceptionalHandlingTask1 {
	static void push(int stack1[],int val) {
		
	}
	public static void main(String[] args) {
		
		
	}

}
