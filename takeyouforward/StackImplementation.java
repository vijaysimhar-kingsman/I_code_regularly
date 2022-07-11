package takeyouforward;
class stack{
	int capacity =2;
	int stack[]= new int[capacity];
	int top=0;
	public void  push(int data) {
		if(top==capacity) {
			int newStack[]= new int[capacity*2];
			//copying values of stack to newStack
			System.arraycopy(stack, 0, newStack, 0, capacity);
			stack= newStack;
			capacity*=2;
			
			
		}
		stack[top]=data;
		top++;
	}
	public void  show() {
		for(int i =0;i<capacity;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		else {
			if(top<(capacity/2)) {
				capacity/=2;
				int newStack[]= new int[capacity];
				System.arraycopy(stack, 0, newStack, 0, capacity);
				stack=newStack;
			}
			System.out.println(stack[top]);
			stack[top]=0;
			top--;
			
		}
	}
	
}
public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack();
		s.push(100);
		s.show();
		s.push(10);
		s.show();
		
		s.push(120);
		s.show();
		s.push(20);
		s.show();
		s.push(200);
		s.show();
		s.push(2000);
		s.show();
		
		s.pop();
		s.show();

		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		System.out.println("every thing fine");
	}

}
