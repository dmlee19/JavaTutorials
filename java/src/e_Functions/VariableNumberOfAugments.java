package e_Functions;

public class VariableNumberOfAugments {
	// 매개변수 int... (...) array로 인식 매개변수 갯수 가변 가능 
	public static int max(int... numbers){ // 매개인자 numbers[] 배열 
		int maximum = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]>maximum){
				maximum = numbers[i];
			}
		}//for
		return maximum;
	}
	public static void main(String[] args) {
		System.out.println(max(3, 4));					// 4
		System.out.println(max(7, 2, 10));				// 10
		System.out.println(max(7, 8, 4, 9, 3, 6, 5));	// 9
		
		int[] data = {3, 18, 32, 15, 5, 6};
		System.out.println(max(data));					// 32
	}
}
