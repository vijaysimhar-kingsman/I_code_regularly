package MultiThreading;

class MyData{
	synchronized public void display(String input_string) {
		for(int i =0;i<input_string.length();i++) {
			System.out.print(input_string.charAt(i));
		}
	}
//	public void display(String input_string) {
//		synchronized(this) {
//			for(int i =0;i<input_string.length();i++) {
//				System.out.print(input_string.charAt(i));
//			}
//		}
//	}
}
class Thread1 extends Thread{
	MyData d;
	public Thread1(MyData d) {
		this.d = d;
	}public void run() {
		d.display("vijay simha kingsman ");
	}
}
class Thread2 extends Thread{
	MyData d;
	public Thread2(MyData d) {
		this.d = d;
	}public void run() {
		d.display("vikram singh rathod");
	}
}
public class ScynchronizedResourceSharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData Data = new MyData();
		Thread1 thread1 = new Thread1(Data);
		Thread2 thread2 = new Thread2(Data);
		thread1.start();
		thread2.start();
	}	

}
