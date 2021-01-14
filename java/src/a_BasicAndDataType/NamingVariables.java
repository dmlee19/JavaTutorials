/*
 * Given age in years, calculate age in days.
 */
package a_BasicAndDataType;

public class NamingVariables {

	public static void main(String[] args) {
		int years = 21; // y, aiy(age in years) 읽기 힘들게 이름 짓지 않는다
		int days = years * 365; // d, aid(age in days) 오해의 소지가 있다 사용X
		// snake case: age_in_years 
		// camel case: ageInDays (Java 개발에서 주로 사용되는 방식)
		System.out.println("You are about " + days + " days old."); // You are about 7665 days old.
	}

}
