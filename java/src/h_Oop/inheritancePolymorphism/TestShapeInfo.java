/**
 * Print out relevant information about each element
 * in an array of GeometricObjects
 */


package h_Oop.inheritancePolymorphism;

public class TestShapeInfo {

	public static void main(String[] args) {
		GeometricObject[] shapes = {
				new Circle(3.0, "blue", true),
				new Rectangle(4.5, 7.2, "green", false),
				new Triangle(3.5, 4.6, 6.7, "ecru", true)
		};

		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
			System.out.printf("Area: %.3f, perimater: %.3f\n", shapes[i].getArea(), shapes[i].getPerimeter());
			// 각각 class가 고유하게 가진 method를 호출 (instanceof)
			if(shapes[i] instanceof Circle){ // instance가 Circle인 경우 true
				double diam = ((Circle)shapes[i]).getDiameter();
				System.out.printf("Diameter: %.3f\n", diam);
			}else if(shapes[i] instanceof Rectangle){
				double diag = ((Rectangle)shapes[i]).getDiagonal();
				System.out.printf("Diagonal: %.3f\n", diag);
			}else{
				double[] angles = ((Triangle)shapes[i]).getAngles();
				System.out.print("Angles: ");
				for (int j = 0; j < angles.length; j++) {
					System.out.printf("%.2f\u00b0 ", Math.toDegrees(angles[j]));
				}
			}
		}
		System.out.println(); // extra spacing
	}
		// Circle with radius: 3.0, Color: blue, Filled: true
		// Area: 28.274, perimater: 18.850

		// Rectangle with dimension: 4.5 X 7.2, Color: green, Filled: false
		// Area: 32.400, perimater: 23.400

		// Triangle with sides: 3.5, 4.6 and 6.7, Color: ecru, Filled: true
		// Area: 7.521, perimater: 14.800

}


