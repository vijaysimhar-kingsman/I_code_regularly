package Oops;
abstract class Animal{
	abstract void run();
	Animal(){
		System.out.println("you gonna create some animal");

	}
	public String living="yes";
}
class Lion extends Animal{
	public void run() {
		System.out.println("lion runs on 4 legs");
	}
	Lion(){
		System.out.println("you created Lion");

	}
}
class Chicken extends Animal{
	public void run() {
		System.out.println("chicken runs on 2 legs");
	}
	Chicken(){
		System.out.println("you created Chicken");

	}
}

public class AbstractionUsingInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//you cannot create an object to an abstract class
		//Animal animal = new Animal();
		//compile time error - cannot instantiate Animal
		Lion lion = new Lion();
		lion.run();//lion runs on 4 legs
		//firstly base class constructor executes and then
		//derived class constructor executes
		// this is called constructors chai rule
		System.out.println(lion.living);
	}

}
