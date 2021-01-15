/**
 * This program tests the Circle and Rectangle classes 
 * by creating Circle and Rectangle objects and using their methods.
 */

package h_Oop.inheritancePolymorphism;

public class TestGeometric_Inheritance {

	public static void main(String[] args) {

	// Inheritance
		Circle myCircle = new Circle(3.0, "blue", true);
		Rectangle myRect = new Rectangle(2.0, 4.0, "white", false);
		
		System.out.println(myCircle); // Circle with radius: 3.0, Color: blue, Filled: true
		System.out.printf("Its area is %.3f.\n", myCircle.getArea()); // Its area is 28.274.
		System.out.printf("Its circumference is %.3f.\n",myCircle.getCircumference()); // Its circumference is 18.850.
		
		System.out.println(myRect); // Rectangle with dimension: 2.0 X 4.0, Color: white, Filled: false
		System.out.printf("Its area is %.3f.\n", myRect.getArea()); // Its area is 8.000.
		System.out.printf("Its circumference is %.3f.\n",myRect.getPerimeter()); // Its circumference is 12.000.
	
	}//main

}
