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
		// GeometricObject shape = new Circle(3.0, "blue", true); // Circle�� GeometricObject ����ϹǷ� ���� ����
		// GeometricObject --> Compile, Circle --> Runtime
		// Circle c = new GeometricObject(); // ��� ��Ұ� ���ԵǾ����� �ʱ� ������ ���� �Ұ�
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
