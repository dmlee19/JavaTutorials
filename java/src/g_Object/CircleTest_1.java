/**
 * Passing Objects to Method 
 * 기존의 Circle instance를 resize한 후에 변경 (원본 instance가 변경)
 */

package g_Object;

public class CircleTest_1 {
	
	public static void resize(Circle c, double factor){
		c.setRadius(c.getRadius()*factor);
	}
	

	public static void main(String[] args) {
		Circle myCircle = new Circle(3.5);
		resize(myCircle, 1.1);
		System.out.println(myCircle.getRadius());
	}
}
