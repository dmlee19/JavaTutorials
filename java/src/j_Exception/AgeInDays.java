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
		//	// twenty�� �Է��� ��� InputMismatchException runtime error �߻�

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
				input.nextLine(); // ������ �Է¹��� ���� ���ֱ� ���� �ڵ�
				System.out.println("Please use digit only.");
			}
		}//while
		int days = years * 365;
		System.out.printf("You are about %d days old.\n", days);
		// ����(twenty)�� �Է��ϸ� InputMismatchException�� ĳġ�ؼ� �����θ� �����Ͽ� ���� �߻����� ����ؼ� ���α׷� ���� ����
		// How many years old are you?: twenty
		// Please use digit only.
		// How many years old are you?:
	}//main

}
