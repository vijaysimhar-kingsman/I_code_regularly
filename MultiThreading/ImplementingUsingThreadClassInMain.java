package MultiThreading;

public class ImplementingUsingThreadClassInMain extends Thread{
	public void run() {
		int i =1;
		while(true) {
			System.out.println(i+" Hello");
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingUsingThreadClassInMain t = new ImplementingUsingThreadClassInMain();
		t.start();
		int i =0;
		while(true) {
			System.out.println(i+ " world");
			i++;
		}

	}

}
