/**
 * Polymorphism and Casting 
 * tests casting among objects.
 */

package h_Oop.inheritancePolymorphism;

public class CastingTest {

	public static void main(String[] args) {
		GeometricObject geo = new GeometricObject();
		Circle c = new Circle(3.0, "blue", true);
		Rectangle r = new Rectangle(4.5, 7.0, "green", false);
		
		double area1 = ((GeometricObject)c).getArea(); // return 0;
		System.out.printf("Cast Circle to GeometricObject area: %.3f\n", area1);
		// Cast Circle to GeometricObject area: 28.274
		// runtime 시 instance인 Circle의 getArea method 호출
		
		// double area2 = ((Circle)geo).getArea();
		// System.out.printf("Cast GeometricObject to Circle area: %.3f\n", area2);		
		// GeometricObject cannot be cast to Circle
		// compile에는 문제가 없지만 runtime에서 문제 발생
		
		// double area3 = ((Rectangle)c).getArea();
		// System.out.printf("Cast Circle to Rectangle area: %.3f\n", area3);		
		// subclass를 또 다른 subclass로 casing ==> compile 오류
	}// main
}
