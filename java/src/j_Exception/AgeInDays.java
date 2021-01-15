/**
 * Exceptions (the basics)
 * Given an age in years,
 * tell user the approximate age in days.
 */

package j_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean valid = false;
		int years = 0;
		//	while(!valid){
		//		System.out.print("How many years old are you?: ");
		//		years = input.nextInt();
		//		if(years > 0){
		//			valid = true;
		//		} else{
		//			System.out.println("Age must be greater than zero.");
		//		}//if
		//	}//while
		//	int days = years * 365;
		//	System.out.printf("You are about %d days old.\n", days);
		//	// twenty를 입력할 경우 InputMismatchException runtime error 발생

		while(!valid){
			try{
				System.out.print("How many years old are you?: ");
				years = input.nextInt();
				if(years > 0){
					valid = true;
				} else{
					System.out.println("Age must be greater than zero.");
				}//if
			}//try
			catch (InputMismatchException ex){
				input.nextLine(); // 이전에 입력받은 값을 없애기 위한 코드
				System.out.println("Please use digit only.");
			}
		}//while
		int days = years * 365;
		System.out.printf("You are about %d days old.\n", days);
		// 문자(twenty)를 입력하면 InputMismatchException를 캐치해서 구현부를 실행하여 에러 발생없이 계속해서 프로그램 실행 가능
		// How many years old are you?: twenty
		// Please use digit only.
		// How many years old are you?:
	}//main

}
