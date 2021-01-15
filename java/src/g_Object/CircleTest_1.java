/**
 * Passing Objects to Method 
 * ������ Circle instance�� resize�� �Ŀ� ���� (���� instance�� ����)
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
