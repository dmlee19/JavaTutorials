/**
 * This program calculates and prints 
 * the diagonal of a Rectangle object
 */

package h_Oop.inheritancePolymorphism;

public class DiagonalTest {

	public static void main(String[] args) {
		GeometricObject shape = new Rectangle(4.5, 7.2, "green", true);
		// double diag = shape.getDiagonal(); // compile error, GeometricObject에 정의되지 않은 메서드
		double diag = ((Rectangle)shape).getDiagonal(); // shape를 Rectangle Class로 캐스팅 
		System.out.printf("Diagonal is %.3f\n", diag); // Diagonal is 8.491
	}

}
