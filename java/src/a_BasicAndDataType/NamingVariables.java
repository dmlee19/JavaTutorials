/*
 * Given age in years, calculate age in days.
 */
package a_BasicAndDataType;

public class NamingVariables {

	public static void main(String[] args) {
		int years = 21; // y, aiy(age in years) �б� ����� �̸� ���� �ʴ´�
		int days = years * 365; // d, aid(age in days) ������ ������ �ִ� ���X
		// snake case: age_in_years 
		// camel case: ageInDays (Java ���߿��� �ַ� ���Ǵ� ���)
		System.out.println("You are about " + days + " days old."); // You are about 7665 days old.
	}

}
