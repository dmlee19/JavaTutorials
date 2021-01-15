/**
 * The ArrayList Class
 * Read an arbitrary number of prices from the keyboard,
 * calculate and print what percentage each of them is
 * of the maximum value.
 */

package i_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 0 입력할 때 까지 가격 입력 가능
		ArrayList<Double> priceList = new ArrayList<>();
		double onePrice = 1.0;
		while(onePrice!=0.0){
			System.out.print("Enter a price or zero when finished: $");
			onePrice = input.nextDouble();
			if(onePrice>0){
				// add onePrice to priceList
				priceList.add(onePrice);
			}//if
		}//while
		
		int nPrices = priceList.size();
		if(nPrices>0){
			// work to do
			double maxPrice = priceList.get(0);
			for (int i = 0; i < nPrices; i++) {
				if(priceList.get(i) > maxPrice){
					maxPrice = priceList.get(i);
				}
			}
			
			for (int i = 0; i < nPrices; i++) {
				double percentOfMax = (priceList.get(i) / maxPrice) * 100;
				priceList.set(i, percentOfMax);
			}
			System.out.println("Here are the percentage of maximum price: ");
			for (double price : priceList) {
				System.out.printf("%.3f%% ", price);
			}
			System.out.println(); // extra line
		}else{
			System.out.println("No data entered");
		}
		input.close();

	}//main

}
