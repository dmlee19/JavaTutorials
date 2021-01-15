/**
 *  Array with different numbers of elements in each row
 */
package f_Array;

public class RaggedArrays {

	public static void main(String[] args) {
		int[][] choices = {
				{9},
				{4, 6, 1},
				{7, 5},
				{3, 1, 2, 8}
		};
		
		int nPeople = 0;
		for (int row = 0; row < choices.length; row++) {
			for (int col = 0; col < choices[row].length; col++) {
				nPeople += choices[row][col];
			}
		}
		System.out.printf("%d people gave their opinion.\n ",nPeople);
	}

}
