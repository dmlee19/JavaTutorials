/**
 * Implement a linear search through an array of integers. 
 */

package f_Array;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] data, int value){
//		for (int position = 0; position < data.length; position++) {
//			if(data[position] == value){
//				return position;
//			}
//		}
//		// 없는 경우 -1 return
//		return -1;
		int position = 0;
		while(position<data.length && data[position]!=value){
			position++;
		}
		return ((position<data.length) ?  position : -1);
		// ternary operator  (condition) ? true인 경우 : false인 경우
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] data = {37, 24, 49, 15, 83 ,56};
		int value = 1;
		while(value!=0){
			System.out.print("Enter number to find or 0 to quit: ");
			value = input.nextInt();
			if(value != 0){
				int foundAt = linearSearch(data,value);
				System.out.printf("%d found at index %d\n", value, foundAt);
			}else{
				value = 0;
			}
		} // while
		System.out.println("Finished");

	}

}
