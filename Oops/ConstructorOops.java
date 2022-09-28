package Oops;

class Student{
	String name;
	int age;
	
	//wn u r creating obj with differ constructors every 
	// with parameters without parameters , every constructor has to be declared
	Student(){
		System.out.println("constructer is executed");

	}
	
	Student(String name , int age){
		this.name = name;
		//here this.age is the object age ,
		//age is the parameter that we are passing
		this.age=age;
	}
	//coping object using constructors
	Student(Student s){
		this.name = s.name;
		this.age = s.age;
	}
	public void printInfo() {
		System.out.println("*name : "+name +" *age :"+age);
	}
}
public class ConstructorOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor with parameters
		Student student1 = new Student("vijay",21);
		
		System.out.println("name : "+student1.name +" age :"+student1.age);
		
		System.out.println("name : "+student1.name +" age :"+student1.age);
		//constructors without parameters
		Student student2 = new Student();
		student2.name ="vijaysimhareddy";
		student2.age = 20;
		//copying object using constructor
		Student student3 = new Student(student2);
		System.out.println("info of student 3");
		student3.printInfo();
		
	}

}
