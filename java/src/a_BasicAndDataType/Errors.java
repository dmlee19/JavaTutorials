/**
 * Give example of three types of error
 */

package a_BasicAndDataType;

public class Errors {

	public static void main(String[] args) {
		// Syntax errors
		// int bad = 34 + * 8;
		
		// Runtime errors
		//int result = 42 / 0; //java.lang.ArithmeticException: / by zero
		
		// Semantic errors
		// �ǵ����� ���� ����� ��� ��. ���� ã�� ���� ���� �� �ϳ�
		int ageInYears = 21; 
		int ageInDays = ageInYears + 365;
		System.out.println("Approximate age in days: " + ageInDays);

		// Error�� �޼������� �����Ǵ� ������ ��Ȯ�ϰ� �������� ���� �� �ִ�. ���Ʒ� �ֺ��� �� ���ǰ� ���� �޼��� �Ĳ��ϰ� �б�!
	}
}
