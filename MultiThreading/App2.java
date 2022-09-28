package MultiThreading;


//creating threads using interfaces key word
//why to use interface why not extens 
// because in java we dont have multi threading so what if a class 
// is already a child of another class  and now want to 
// extend thread there we use implements
class CA{
	
}
//
class myTask extends CA implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("printing"+i+" -printer2");

		}
	}
}
public class App2 {

	public static void main(String[] args) {
System.out.println("==application started1==");
		
		//job2
//		myTask task = new myTask();
//		task.start();
//polymorphic staement : the reference variable of the interface
//is pointing to the object which implements it then 
		Runnable r = new myTask();
//normal thread object is created 
		Thread task = new Thread(r);
		task.start();
		
		//job3
		//some code to print 
		for(int i=0;i<10;i++) {
			System.out.println("printing"+i+" -printer1");

		}
		System.out.println("==application ended==");
		//execution of threads is lies in hands of jvm so 
		// every time you run you will get new output
	}

}
