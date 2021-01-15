/**
 *  Given one week's worth of maximum temperatures in degrees Celsius,
 *  calculate the average and determine how many are above average,
 *  and how many are at or below average.  
 */

package f_Array;

public class ArrayBasic {
	public static void main(String[] args) {
//		double temperature1 = 27.2;
//		double temperature2 = 25.1;
//		double temperature3 = 24.0;
//		double temperature4 = 21.2;
//		double temperature5 = 25.7;
//		double temperature6 = 23.4;
//		double temperature7 = 26.9;
//		
//		double sum = temperature1 + temperature2 + temperature3 +
//				temperature4 + temperature5 + temperature6 + temperature7;
//		double average = sum/7;
//		
//		int nAbove = 0;
//		if(temperature1 > average){
//			nAbove++;
//		}
//		if(temperature2 > average){
//			nAbove++;
//		}
//		if(temperature3 > average){
//			nAbove++;
//		}
//		if(temperature4 > average){
//			nAbove++;
//		}
//		if(temperature5 > average){
//			nAbove++;
//		}
//		if(temperature6 > average){
//			nAbove++;
//		}
//		if(temperature7 > average){
//			nAbove++;
//		}
//		System.out.printf("Average temperature for %d days: %.1fC\n", 7, average); 
//		System.out.printf("# days above average : %d\n", nAbove);			
//		System.out.printf("# days at or below average : %d\n", 7 - nAbove);	
		// Average temperature for 7 days: 24.8C
		// # days above average : 4
		// # days at or below average : 3

/**
* Array 사용 해서 같은 결과를 짧은 코드 구현 가능 
*/

		// double[] temperatures = new double[7];
		// temperatures[0] = 27.2;
		// temperatures[1] = 25.1;
		// temperatures[2] = 24.0;
		// temperatures[3] = 21.2;
		// temperatures[4] = 25.7;
		// temperatures[5] = 23.4;
		// temperatures[6] = 26.9;
		
		double[] temperatures = {27.2, 25.1, 24.0, 21.2, 25.7, 23.4, 26.9}; // Array 선언, 정의
		
		double sum = 0;
		for (int index = 0; index < temperatures.length; index++) {
			sum += temperatures[index];
		}
		double average = sum / temperatures.length;
		int nAbove = 0;
		for (double d : temperatures) {
			if(d>average){
				nAbove++;
			}
		}
		System.out.printf("Average temperature for %d days: %.1fC\n", temperatures.length, average);
		System.out.printf("# days above average : %d\n", nAbove);									
		System.out.printf("# days at or below average : %d\n", temperatures.length - nAbove);		
		// Average temperature for 7 days: 24.8C
		// # days above average : 4
		// # days at or below average : 3
	}//main
}
