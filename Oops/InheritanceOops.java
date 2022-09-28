package Oops;
/*
getting methods and properties of one to another 
class is called inheritance
-Re usability Increases
-Parent class - base class / super class
-child class -sub class 
*/

/*
 TYPES OF INHERITANCE
 
 SINGLE A->B
 MULTILEVEL A->B->C
 HIERARCHICAL A->B A->C
 HYBRID A->B->C A->D This will be done with interfaces
 
 */

class Shape{
	String color;
	public void area() {
		System.out.println("displying your area");
	}
} 
//Single level inheritance - 1 level 
class Triangle extends Shape{
	//as we extracting things from shape 
	// no we also have color in triangle
	public void area(int l ,int b) {
		System.out.println("area triangle : "+ ((1/2)*l*b));
	}
	
	
}//multilevel inheritance  - more than one level
class EquilateralTriangle extends Triangle{
	public void area(int l ,int b) {
		System.out.println("area  of equi tirangle: "+ ((1/2)*l*b));
	}
}

// Hierarchical Inheritance 
class  Circle extends Shape {
	public void area(int r) {
		System.out.println("area of circle : "+ Math.round((Math.PI*r*r*100))/100d);
	}
}
public class InheritanceOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.area(2);
	}

}
