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
			// priceFile에서 입력 
			//there is more input available (hasNext())
			while(input.hasNext()){// prices.txt 파일에 input 값이 남은 경우 true
				String line = input.nextLine(); // 각각 요소를 단위로 읽는 거 보다 라인 별로 읽는 것이 좋음
				//double price = input.nextDouble();// read next double from Scanner;
				double price = Double.valueOf(line);//line에서 읽은 단위를 double로 변환
				// 포맷을 double로 전환 했을때, InputMismatchException 수정 필요
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
		catch (FileNotFoundException e) { //Scanner input을 파일로 하는 경우 꼭 필요한 Exception
			System.out.println("File prices.txt not found.");
			e.printStackTrace();
		}// file에 적합하지 않은 데이터가 있는 경우 (추가)
		//catch (InputMismatchException ex){
		catch (NumberFormatException ex){ //import 필요 X 
		System.out.println("Bad data in the file");
			System.out.println(ex);
		}
		/* prices.txt 에 문자 추가한 경우 
		 * Bad data in the file
		 * java.util.InputMismatchException 
		 */
		
		/* NumberFormatException으로 변경한 후 에러메세지
		 * Bad data in the file
		 * java.lang.NumberFormatException: For input string: "9.oo"
		 * --> 에러 관리하는데 효율적
		 */

	}//main
}
