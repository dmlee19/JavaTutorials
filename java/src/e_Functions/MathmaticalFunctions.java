package e_Functions;

public class MathmaticalFunctions {

	public static void main(String[] args) {
		System.out.println(Math.exp(2));		// e^2 = 7.38905609893065
		System.out.println(Math.log(9)); 		// ln(9)= 2.1972245773362196
		System.out.println(Math.log10(1000)); 	// log10(1000) = 3.0
		System.out.println(Math.pow(2,3)); 		// 2^3 = 8.0
		System.out.println(Math.sqrt(9));		// 9^(1/2) = 3.0
		System.out.println(Math.E); 			// e = 2.718281828459045
		System.out.println(Math.sin(Math.PI/2));// sin(PI/2) = 1.0
		System.out.println(Math.cos(Math.PI)); 	// cos(PI) = -1.0
		System.out.println(Math.tan(Math.PI/4));// tan(PI/4) = 0.9999999999999999
		System.out.println(Math.PI); 			// 3.141592653589793
		System.out.println(Math.ceil(3.2)); 	// �ø� = 4
		System.out.println(Math.floor(3.8));	// ���� = 3
		System.out.println(Math.rint(3.5)); 	// ����� ����(¦��) = 4
		System.out.println(Math.rint(3.2));		// ����� ���� = 3
		System.out.println(Math.rint(4.2));		// ����� ���� = 4
		System.out.println(Math.rint(4.5));		// ����� ����(¦��)= 4
		System.out.println(Math.rint(5.5));		// ����� ����(¦��)= 6
		System.out.println(Math.round(3.2));	// �ݿø� = 3
		System.out.println(Math.round(3.6)); 	// = 4
		int n = (int) Math.round(2.5); 			// int�� ��� �ϱ� ���ؼ� (int) casting �ʿ�
		System.out.println(Math.max(2, 6));		// �ִ밪 = 6
		System.out.println(Math.min(9, 5)); 	// �ּҰ� = 5
		System.out.println(Math.abs(-1.34)); 	// ���� �� = 1.34
		System.out.println(Math.random()); 		// 0<= ������ ��ȣ  < 1.0
		System.out.println((int)(18+Math.random()*(66-18)));// 18 <= ������ ��ȣ  < 66
	}

}
