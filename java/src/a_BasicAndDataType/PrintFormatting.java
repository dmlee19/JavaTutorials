/**
 * printing with different formatting 
 */

package a_BasicAndDataType;

import java.util.Scanner;

public class PrintFormatting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
/**
 * Calculate 15% discount on a price
 */
		System.out.print("Enter the price $ : ");
		double price = input.nextDouble();
		double discounPrice = price  * 0.85;
		System.out.println("Your price is $" + discounPrice + " after 15% discount.");
		// �Է� ���ڿ� ���� �Ҽ��� �� �ڸ����� ����
		System.out.format("Your price is $ %.2f after 15%% discount.\n", discounPrice);
		// %.2f: �Ҽ��� �Ʒ� 2�ڸ� float, %d: integer (%�� ����ϱ����ؼ� �ι� ���) 
		// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html ����
	
/**
 * Given age in years, calculate age in days.
 */
		System.out.print("Enter your age in years: ");
		int ageInYears = input.nextInt();
		int ageInDays = ageInYears * 365; 
		input.close();
		// 21 �Է� ��� 
		System.out.println("You are about " + ageInDays + " days old."); // You are about 7665 days old.
		System.out.format("You are about %d days old.\n", ageInDays);	 // You are about 7665 days old.
		System.out.format("%d years is about %d days.\n", ageInYears, ageInDays); // 21 years is about 7665 days.
		
	
	}//main
	
}
