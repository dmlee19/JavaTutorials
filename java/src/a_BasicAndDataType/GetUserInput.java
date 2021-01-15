/*
 * Given age in years, calculate age in days.
 */
package a_BasicAndDataType;

import java.util.Scanner;

public class GetUserInput {
	public static void main(String[] args) {
		// User input을 받기 위해서 Scanner 사용
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age in years: "); // input prompt
		int ageInYears = input.nextInt(); // int: Integer 
		int ageInDays = ageInYears * 365; 
		input.close();
		System.out.println("You are about " + ageInDays + " days old.");
	}//main
}
