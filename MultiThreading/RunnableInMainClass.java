package MultiThreading;

public class RunnableInMainClass implements Runnable{
	public void run(){
		int i =1;
		while(true) {
			System.out.println(i+" Hello");
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInMainClass r = new RunnableInMainClass();
		Thread t = new Thread(r);
		
		t.start();
		int i =1;
		while(true) {
			System.out.println(i+" World");
			i++;
		}
		
	}

}
