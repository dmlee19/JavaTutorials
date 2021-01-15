/**
 * Primitive and Reference Types 
 * Primitive : �޸𸮿� �� ��ü�� ����
 * Reference : �޸𸮿� instance�� reference�� ����
 */

package g_Object.primitiveReference;

public class TestRectangle {

	public static void main(String[] args) {
		int j = 3;
		int k = 4;
		System.out.println(j);	// 3
		System.out.println(k);	// 4
		j = k; // k�� ��(4)�� j�� ����
		System.out.println(j);	// 4
		k = 3; 
		System.out.println(j);	// 4
		System.out.println(k);	// 3
		// --> k �� 3���� ���� j�� ��ȭ ���� 
		
		Rectangle r1 = new Rectangle(); // Rectangle -> Class, r1 -> Object, instance
		Rectangle r2 = new Rectangle(3.0, 5.5); 		

		double area1 = r1.getArea();
		double perimeter1 = r1.getPerimeter();
		System.out.printf("area: %.2f, perimeter: %.2f\n", area1, perimeter1);
		System.out.printf("area: %.2f, perimeter: %.2f\n", r2.getArea(), r2.getPerimeter());
		
		r2 = r1; // r2�� r1 �� instance reference ���� ���� 
		r1.width = 4.0;	// r1�� ���ؼ� instance�� width �� ����
		System.out.printf("area: %.2f, perimeter: %.2f\n", r2.getArea(), r2.getPerimeter());
		// r2�� ���� �ѷ� ���� ���� width=4.0���� ����Ǿ� ����
	}//main

}
