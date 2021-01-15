/**
 * overload method
 */

package e_Functions;

public class OverloadedMethod {
	public static int max(int a, int b){
		if(a>b){
			return a;
		}else
			return b;
	}
	
	public static double max(double a, double b){
		if(a>b){
			return a;
		}else
			return b;
	}
	
	public static int max(int a, int b, int c){
		int maxAB = max(a,b);
		return max(maxAB,c);
	}
	
	public static void main(String[] args) {
		//���� method�� �Ű����� ������ �ٸ��ų� �ڷ����� �ٸ��� overloading�ؼ� ��� ����
		System.out.println(max(6, 4));		// 6
		System.out.println(max(5.6, 7.4));	// 7.4
		System.out.println(max(9.5, 7));	// 9.5
		System.out.println(max(5, 7, 4));	// 7
	}

}
