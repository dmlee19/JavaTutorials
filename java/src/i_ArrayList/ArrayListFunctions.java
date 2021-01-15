/**
 * Show conversion from an array of object
 * to an ArrayList.
 */

package i_ArrayList;

import java.util.ArrayList;
// case 2.
import java.util.Arrays;

public class ArrayListFunctions {

	public static void main(String[] args) {
		String[] chemicalArray = {"H2O", "NaCl", "H2SO4", "CO2"};
		String[] planetArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
		
		// case 1. directly convert using foreach
		ArrayList<String> chemicalList = new ArrayList<>();
		for(String chemical: chemicalArray){
			chemicalList.add(chemical);
		}
		System.out.println(chemicalList); // [H2O, NaCl, H2SO4, CO2]
		
		// case 2. using asList method
		ArrayList<String> planetList = new ArrayList<>(Arrays.asList(planetArray));
		System.out.println(planetList); // [Mercury, Venus, Earth, Mars, Jupiter]

/** 
 * ArrayList functions
 */
			// 1-1. remove with index
			chemicalList.remove(2);
			System.out.println(chemicalList); // [H2O, NaCl, CO2]
			// 1-2.remove with value
			boolean removedOk = planetList.remove("Mars");
			System.out.println(removedOk); // true (Mars 삭제 성공)
			removedOk = planetList.remove("Saturn");
			System.out.println(removedOk); // false (리스트에 없는 값 삭제 실패)
		
			// 1-3. remove with Integer value
			// int[] ageArray = {32, 19, 45, 25, 60}; // int[] 로 선언하는 경우 Arrays.asList(ageArray) compile error
			// ArrayList<Integer> ageList = new ArrayList<>(Arrays.asList(ageArray)); // compile error 
		
			Integer[] ageArray = {32, 19, 45, 25, 60}; 
			ArrayList<Integer> ageList = new ArrayList<>(Arrays.asList(ageArray)); 
			System.out.println(ageList);
		
			// ageList.remove(19); // 19를 index로 인식하여 error (IndexOutOfBoundsException)
			removedOk = ageList.remove(Integer.valueOf(19)); // Integer value 입력 시 --> Integer.valueOf()
			System.out.println(removedOk); // true
			System.out.println(ageList); // [32, 45, 25, 60]
			
			// 2-1 contains
			boolean containedOk = planetList.contains("Earth");
			System.out.println(containedOk); // true
			containedOk = planetList.contains("Pluto");
			System.out.println(containedOk); // false
			
			// 3-1 indexOf
			String[] nameArray = {"Faye", "Joe", "Gloria", "Vinh", "Joe", "Elena"};
			ArrayList<String> nameList = new ArrayList<>(Arrays.asList(nameArray));
			System.out.println(nameList);
			System.out.println(nameList.indexOf("Joe"));		// 1
			System.out.println(nameList.indexOf("Gloria"));		// 2
			System.out.println(nameList.indexOf("Norman"));		// -1 (List에 없음)
			System.out.println(nameList.lastIndexOf("Joe"));	// 4 
			System.out.println(nameList.lastIndexOf("Gloria"));	// 2
			System.out.println(nameList.lastIndexOf("Norman"));	// -1 
			
			
	}//main 

}
