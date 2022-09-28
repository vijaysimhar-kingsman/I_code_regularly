package MultiThreading;
// when we are creating a class which is implmented using runnable
class MyRun implements Runnable{
	public void run() {
		System.out.println("runnable overrided");
	}
}
class MyThread extends Thread{
	public void run() {
		System.out.println("extend overrided");
	}
	MyThread( String name){
		//since this method is a sub class of Thread , in thread there is a constructor which takes name as a parameter
		//there fore calling constructor of thread class
		super(name);
		//you can change the priority
		setPriority(Thread.MIN_PRIORITY+1);
		int i =1;
		while(true) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			i++;
		}
	}
	//we can set priority of thread
	
}
public class MethodsOfThreads {

	public static void main(String[] args) {
		
		// thread(Runnable r , String name);
		Thread t = new Thread(new MyRun(),"my thread 1");
		
		//since you have to pass a name there should be a constructor which is taking name
		//since the class is extended from Thread main class we can pass name to it directly
		 MyThread tt = new MyThread("my extended thread");
		 
		 //some methods of threads
		 //id will be given by jvm's
		 System.out.println("t id "+t.getId());
		 System.out.println("tt id "+tt.getId());
		 
		 System.out.println("t name "+t.getName());
		 System.out.println("tt name "+tt.getName());
		 
		 System.out.println("t priority "+t.getPriority());
		 System.out.println("tt priority "+tt.getPriority());
		 
		 System.out.println("tt state "+tt.getState());
		 
		 System.out.println("tt isAlive "+tt.isAlive());
		 tt.start();
		 
		 
		
	}

}
