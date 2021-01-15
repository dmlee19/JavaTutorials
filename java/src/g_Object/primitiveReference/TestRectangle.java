/**
 * Primitive and Reference Types 
 * Primitive : 메모리에 값 자체를 저장
 * Reference : 메모리에 instance의 reference를 저장
 */

package g_Object.primitiveReference;

public class TestRectangle {

	public static void main(String[] args) {
		int j = 3;
		int k = 4;
		System.out.println(j);	// 3
		System.out.println(k);	// 4
		j = k; // k의 값(4)을 j에 저장
		System.out.println(j);	// 4
		k = 3; 
		System.out.println(j);	// 4
		System.out.println(k);	// 3
		// --> k 만 3으로 변경 j는 변화 없음 
		
		Rectangle r1 = new Rectangle(); // Rectangle -> Class, r1 -> Object, instance
		Rectangle r2 = new Rectangle(3.0, 5.5); 		

		double area1 = r1.getArea();
		double perimeter1 = r1.getPerimeter();
		System.out.printf("area: %.2f, perimeter: %.2f\n", area1, perimeter1);
		System.out.printf("area: %.2f, perimeter: %.2f\n", r2.getArea(), r2.getPerimeter());
		
		r2 = r1; // r2에 r1 의 instance reference 값을 저장 
		r1.width = 4.0;	// r1을 통해서 instance의 width 값 변경
		System.out.printf("area: %.2f, perimeter: %.2f\n", r2.getArea(), r2.getPerimeter());
		// r2의 면적 둘레 길이 또한 width=4.0으로 변경되어 저장
	}//main

}
