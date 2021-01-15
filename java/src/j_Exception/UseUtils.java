/**
 * Demonstrate use of exceptions in library
 * --> 라이브러리 구성 시 사용자가 필요한 에러 프로세스와 상관없이 사용자가 필요에 맞게 사용할 수 있는지 판단하도록 
 * 		Exception을 설정하고 throw
 */

package j_Exception;

class ArrayUtils {
	// 1. data array에서 최대값을 찾는 함수를 가지는 라이브러리 생성
	// 4. 빈 array를 매개변수로 사용했을때, 단순히 if문으로 error 메세지를 출력하거나 임의의 return값을 지정하는 것은 적합하지 않다. 
	// (누가 어떤 목적으로 라이브러리를 사용할 줄 모름)
	// 5. throw
	public static int max (int [] data) throws IllegalArgumentException{
		if(data.length > 0){
			int maxVal = data[0];
			for(int item : data){
				if(item > maxVal){
					maxVal = item;
				}
			}
			return maxVal;
		} else {
			throw new IllegalArgumentException("Array length must be greater than zero");
		}
		
	}
}
//-----------------------------------
public class UseUtils {
	public static void main(String[] args) {
		// 2. 라이브러리 사용자가 data가 없는 array를 max array로 전송
		int [] empty = new int[0];
		int maximum = ArrayUtils.max(empty);
		System.out.println("Maximum value is " + maximum);
		// 3. Error: ArrayIndexOutOfBoundsException: 0
		// 6. throw 후 결과: IllegalArgumentException: Array length must be greater than zero 
		// 계속해서 Exception이 발생하지만, 사용자가 해결하는데 도움줄 수 있도록 exception 설정 가능
	}
}