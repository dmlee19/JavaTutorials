/**
 * This program calculates and prints 
 * the diagonal of a Rectangle object
 */

package h_Oop.inheritancePolymorphism;

public class DiagonalTest {

	public static void main(String[] args) {
		GeometricObject shape = new Rectangle(4.5, 7.2, "green", true);
		// double diag = shape.getDiagonal(); // compile error, GeometricObject�� ���ǵ��� ���� �޼���
		double diag = ((Rectangle)shape).getDiagonal(); // shape�� Rectangle Class�� ĳ���� 
		System.out.printf("Diagonal is %.3f\n", diag); // Diagonal is 8.491
	}

}
