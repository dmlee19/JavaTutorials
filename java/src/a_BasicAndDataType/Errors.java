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
		// 의도하지 않은 결과를 얻는 것. 가장 찾기 힘든 에러 중 하나
		int ageInYears = 21; 
		int ageInDays = ageInYears + 365;
		System.out.println("Approximate age in days: " + ageInDays);

		// Error는 메세지에서 문제되는 라인을 정확하게 지목하지 않을 수 있다. 위아래 주변을 잘 살피고 에러 메세지 꼼꼼하게 읽기!
	}
}
