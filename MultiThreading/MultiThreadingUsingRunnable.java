package MultiThreading;
class MyRunnable implements Runnable{
	public void run(){
		int i =1;
		while(true) {
			System.out.println(i+" Hello");
			i++;
		}
	}
}
public class MultiThreadingUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		
		t.start();
		int i =1;
		while(true) {
			System.out.println(i+" World");
			i++;
		}
		
		
	}

}
