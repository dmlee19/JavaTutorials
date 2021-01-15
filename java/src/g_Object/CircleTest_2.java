/**
 * Passing Objects to Method 
 * ���ο� Circle instance�� ������ �Ŀ� resize (���� instance�� ���� �״�� ����)
 */

package g_Object;

public class CircleTest_2 {

	public static Circle resize(Circle c, double factor){
		Circle result = new Circle(c.getRadius()*factor);
		return result;
	}
	
	public static void main(String[] args) {
		Circle myCircle = new Circle(3.5);
		Circle newCircle = resize(myCircle, 1.1);
		System.out.println(myCircle.getRadius());
		System.out.println(newCircle.getRadius());
	}

}
