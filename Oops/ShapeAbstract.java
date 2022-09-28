package Oops;

abstract class Shapes{
	abstract public void perimeter();
	abstract public void area();
	
}
class Circles extends Shapes{ 
	int radius;
	Circles(int r){
		this.radius =r;
	}@Override
	public void perimeter() {
		System.out.println(Math.PI * radius *2);
	}@Override
	public void area() {
		System.out.println(Math.PI * radius *radius);

	}
}//as all the abstract methods are overrided , class circles is no more an abstract class it is now a concrete class
class Rectanle extends Shapes{
	int length;
	int breadth;
	Rectanle(int l ,int b){
		this.length =l;
		this.breadth =b;
	}@Override
	public void perimeter() {
		System.out.println(2*(length +breadth));
	}@Override
	public void area() {
		System.out.println(length * breadth);

	}
}
public class ShapeAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes c = new Circles(10);
		//using super class reference calling sub class object , which gives access to all the overrided method 
		// and only methods which are common in both classes will be accessed
		c.area();
		c.perimeter();

	}

}
