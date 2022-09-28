package Oops;
//import Oops.RGUKT_Student;

/*NOTES 
 * 
 * polymorphism means poly -many morphism - forms
 * doing one thing in different ways is called polymorphism
 * 
 * there are two types of polymorphisms 
 * 1-method overloading (compiletime - polymorphism)
 * 2-method overriding (runtime -polymorphism)
 * What is compile time and run time polymorphism in Java?
   In Compile time Polymorphism, the call is resolved by the compiler.
   In Run time Polymorphism, the call is NOT resolved by the compiler.
   compiletime polymorphism - Static binding, Early binding -overloading. 
   runtime polymorphism - Dynamic binding Late binding , overriding as well.
 * 
 * overloading - except method name some thing has to be
 * different in two methods.
 * */
class RGUKT_Student {
	String name ;
	int age;
	//method overloading
	public void printInfo(int age) {
		//return age;
		System.out.println("Age : "+age);
	}
	public void printInfo(String name) {
		//return ;
		System.out.println("Name : "+name);
	}
	public boolean PrintInfo() {
		return this.age>18?true:false;
	}
	
	RGUKT_Student(String name , int age){
		this.name = name;
		this.age = age;
	}RGUKT_Student (RGUKT_Student s){
		name = s.name;
		age=s.age;
	}
}
public class PolymorphismOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGUKT_Student student1 = new RGUKT_Student("vikram",33);
		RGUKT_Student student2 = new RGUKT_Student(student1);
		student2.name ="pablo";
		
		student1.printInfo("samju");
		//RGUKT_Student2.printInfo();
		if(student1.PrintInfo()){
			System.out.println("yes "+student1.name +" you are eligible to vote");
		}else {
			System.out.println("sorry "+student1.name +" you are not eligible to vote");

		}
	}

}
