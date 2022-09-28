package MultiThreading;

class WhiteBoard{
	String text;
	int noOfStudents =0;
	int counter =0;
	public void  attandance() {
		
		noOfStudents++;
		
	}
	synchronized public void write(String str) {
		while(counter !=0) {
			try {
				wait();
			}catch(Exception e) {System.out.print("wating");} 
		}
		text = str;
		System.out.println("teacehr has written : "+text+"\n");
		counter=noOfStudents;
		notifyAll();
	}
	synchronized public String read() {
		while(counter==0) {
			try {
				wait();
				
			}catch(Exception e) {}
		}
		
		counter--;
		//System.out.println(name + "read "+text);
		
		if(counter==0) notify();
		
		return this.text;
		
	}
	
}class Teacher extends Thread{
	WhiteBoard wb;
	String arr[]={"this is java ","this is bava ","this is palakova","this is jamakaya","End"};
	public Teacher(WhiteBoard wb) {
		this.wb = wb;
		
		
	}public void run() {
		for(int i =0;i<arr.length;i++) {
			wb.write(arr[i]);
		}
		
	}
}
class Student extends Thread{
	WhiteBoard wb;
	String name;
	public Student(WhiteBoard wb,String name) {
		this.wb = wb;
		this.name = name;
		
		
	}public void run() {
		wb.attandance();
		String result_string;
		
		do {
			result_string = wb.read();
			
			System.out.println(name +" Reading "+result_string);
			System.out.flush();
		}while(!result_string.equals("End"));
		
	}
}
public class TeacherStudentWhiteBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhiteBoard wb =new WhiteBoard();
		Teacher teacher1 = new Teacher(wb);
		Student student1 = new Student(wb ,"vijay");
		Student student2 = new Student(wb,"ajay");
		Student student3 = new Student(wb,"ravi");
		Student student4 = new Student(wb,"vikram");
		
		teacher1.start();
		
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		
	}

}
