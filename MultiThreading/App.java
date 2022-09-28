package MultiThreading;
import java.lang.*;
//creating threads using extends key word
class myTask extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("printing"+i+" -printer2");

		}
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whatever we write in here will be execute by main thread
		//threads always execute the jobs in a sequence
		//execution context
		
		//job1
		System.out.println("==application started==");
		
		//job2
		myTask task = new myTask();
		task.start();//start shall internally execute run method
		//till job2 is not finished below written jobs are waiting are not executed
		//In case job2 is a long running operation , i.e several documets are suppose to printed
		//In such a use case OS/JVM shall give a message that app is not responding
		//some sluggish behaviour in app can be observed app seems to hand
		
		
		//job3
		//some code to print 
		for(int i=0;i<10;i++) {
			System.out.println("printing"+i+" -printer1");

		}
		System.out.println("==application ended==");
		//the output will be mix of all jobs 
		//what we conclude is there will be some processes 
		// thatwill take long time in order to complete all tasks 
		// threads are used .
	}

}
