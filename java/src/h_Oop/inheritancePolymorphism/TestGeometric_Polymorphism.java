/**
 * This program tests the Circle, Rectangle and Triangle classes 
 * by creating an array of GeometricObjects 
 * and calling the appropriate methods.
 * Polymorphism: A parents class variable is used to refer to a child class object 
 */

package h_Oop.inheritancePolymorphism;

public class TestGeometric_Polymorphism {

	public static void main(String[] args) {

	// Polymorphism
		// GeometricObject shape = new Circle(3.0, "blue", true); // Circle이 GeometricObject 상속하므로 선언 가능
		// GeometricObject --> Compile, Circle --> Runtime
		// Circle c = new GeometricObject(); // 모든 요소가 포함되어있지 않기 때문에 선언 불가
		GeometricObject[] shapes = {
				new Circle(3.0, "blue", true),
				new Rectangle(4.5, 7.2, "green", false),
				new Triangle(3.5, 4.6, 6.7, "ecru", true)
		};
		double totalArea = 0.0;
		for (int i = 0; i < shapes.length; i++) {
			totalArea += shapes[i].getArea();
		}
		System.out.printf("Total area is %.3f\n", totalArea); // Total area is 68.195

	}//main

}
