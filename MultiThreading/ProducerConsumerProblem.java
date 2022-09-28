package MultiThreading;
class AllData{
	int value;
	boolean flag =true;
	synchronized public void set(int val) {
		while(flag != true) {
			try {
				wait();
			}catch(Exception e) {}
		}
		value = val;
		flag = false;
		notify(); //this method notifies any one of the consumer that producer has written something.

	}
	synchronized public int get() {
		int x =0;
		while(flag != false) {
			try {
				wait();
			}catch(Exception e) {}
		}
		
		x=value;
		flag = true;
		notify();
		return x;
	}
}
class Producer extends Thread{
	AllData data;	
	public Producer(AllData data) {
		this.data =data;
	}
	public void run() {
		int i =1;
		while(true) {
			data.set(i);
			System.out.println("producer set value : "+ i);
			i++;
		}
	}
}
class Consumer extends Thread{
	AllData data;	
	public Consumer(AllData data) {
		this.data =data;
	}
	public void run() {
		
		while(true) {
			int v=data.get();
			System.out.println("Consumer get value : "+v);

		}
	}
}
public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllData data = new AllData();
		Producer  p1 = new Producer(data);
		Consumer c1 = new Consumer(data);
		p1.start();
		c1.start();

	}

}
