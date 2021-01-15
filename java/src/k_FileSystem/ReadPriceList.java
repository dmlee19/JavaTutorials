/**
 * Read a list of prices, total them, 
 * add 5% sales tax, and print the results.
 */

package k_FileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadPriceList {

	public static void main(String[] args) {
		final double TAX_RATE = 0.05;
		double subtotal = 0.0;
		int nItems = 0;

		// create a File from file prices.txt
		File priceFile = new File("prices.txt");
		//create Scanner to read from file
		Scanner input;
		try {
			input = new Scanner(priceFile);
			// priceFile���� �Է� 
			//there is more input available (hasNext())
			while(input.hasNext()){// prices.txt ���Ͽ� input ���� ���� ��� true
				String line = input.nextLine(); // ���� ��Ҹ� ������ �д� �� ���� ���� ���� �д� ���� ����
				//double price = input.nextDouble();// read next double from Scanner;
				double price = Double.valueOf(line);//line���� ���� ������ double�� ��ȯ
				// ������ double�� ��ȯ ������, InputMismatchException ���� �ʿ�
				subtotal += price;
				nItems++;
			} //while
			//close Scanner
			input.close();

			//calculate and print summary information
			double tax = subtotal * TAX_RATE;
			System.out.printf("Number of items: %d\n", nItems);
			System.out.printf("Subtotal: $%7.2f\n", subtotal);
			System.out.printf("Tax: $%7.2f\n", tax);
			System.out.printf("Total: $%7.2f\n", subtotal + tax);
			/* 	Number of items: 50
				Subtotal: $ 228.09
			 	Tax: $  11.40
			   	Total: $ 239.49 */
		} 
		catch (FileNotFoundException e) { //Scanner input�� ���Ϸ� �ϴ� ��� �� �ʿ��� Exception
			System.out.println("File prices.txt not found.");
			e.printStackTrace();
		}// file�� �������� ���� �����Ͱ� �ִ� ��� (�߰�)
		//catch (InputMismatchException ex){
		catch (NumberFormatException ex){ //import �ʿ� X 
		System.out.println("Bad data in the file");
			System.out.println(ex);
		}
		/* prices.txt �� ���� �߰��� ��� 
		 * Bad data in the file
		 * java.util.InputMismatchException 
		 */
		
		/* NumberFormatException���� ������ �� �����޼���
		 * Bad data in the file
		 * java.lang.NumberFormatException: For input string: "9.oo"
		 * --> ���� �����ϴµ� ȿ����
		 */

	}//main
}
