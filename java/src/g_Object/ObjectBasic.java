package g_Object;

public class ObjectBasic {
	public static double getArea(double width, double height){
		return width * height;
	}
	public static double getPerimeter(double width, double height){
		return 2 * (width + height);
	}
	public static void main(String[] args) {
		double r1Width = 3.5;
		double r1Height = 4.0;
		System.out.printf("Rectangle 1 area: %.2f, perimeter: %.2f\n"
				,getArea(r1Width, r1Height), getPerimeter(r1Width, r1Height));
		
		double r2Width = 7.0;
		double r2Height = 3.0;
		System.out.printf("Rectangle 2 area: %.2f, perimeter: %.2f\n"
				,getArea(r2Width, r2Height), getPerimeter(r2Width, r2Height));
		// ������ �Լ��� ���������� �����ǰ� ���  --> ���� ��� �����ϸ� ���� ������? --> �簢�� Class ���� (Ractangle)
	}//main
}

