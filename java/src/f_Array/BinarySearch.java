/**
 * Implement a binary search through an array of String 
 */

package f_Array;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(String[] data, String value){
		int low = 0;
		int high = data.length - 1;
		while(high >= low){
			int mid = (low+high) / 2;
			if (data[mid].equals(value)){
				return mid;	
			}else if(value.compareTo(data[mid])<0){
				high = mid - 1;
			}else{
				low = mid + 1;
			}//if else
		}//while
		return -low -1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] countries = {"AT", "AU", "DE", "ES", "FR", "HU", 
							  "IS", "JP", "KR", "PT", "TW", "US"};
		String value = "1";
		while(!value.equals("")){
			System.out.print("Enter country code to find or press ENTER to quit: ");
			value = input.nextLine().toUpperCase();
			if(!value.equals("")){
				int foundAt = binarySearch(countries, value);
				System.out.printf("%s found at index %d\n", value, foundAt);
			}
		} // while
		System.out.println("Finished");
	}
}
