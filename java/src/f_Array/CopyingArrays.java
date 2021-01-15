/**
 * Demonstrate that arrays are reference types,
 * and simple assignment copies the reference, not the data. 
 */

package f_Array;

public class CopyingArrays {
	public static void main(String[] args) {
		int a = 22;
		int b = a;
		
		System.out.println(a);	// 22
		System.out.println(b);	// 22
		b = 8;
		System.out.println(a);	// 22
		System.out.println(b);	// 8
		// ==> 변수에 저장된 값을 해당 변수의 공간에 저장한다. 
		
		int[] arrayA = {100,101,102};
		int[] arrayB = arrayA;
				
		System.out.println(arrayA[1]);	// 101
		arrayB[1] = 999;
		System.out.println(arrayA[1]);	// 999
		// 변수에 지정된 array reference 값을 해당 변수에 저장한다. 
		
		// 새로운 reference를 가지도록 copy
		int[] arrayC = new int[3];
		for (int i = 0; i < arrayA.length; i++) {
			arrayC[i] = arrayA[i];
		}
		arrayC[1] = 777;
		System.out.println("arrayA[1] : " + arrayA[1]); // 999
		System.out.println("arrayC[1] : " + arrayC[1]); // 777
		
		int[] arrayD = new int[arrayA.length];
		System.arraycopy(arrayA, 0, arrayD, 0, arrayA.length);
		arrayD[1] = 333;
		System.out.println("arrayA[1] : " + arrayA[1]); // 999
		System.out.println("arrayD[1] : " + arrayD[1]); // 333
	}
}
