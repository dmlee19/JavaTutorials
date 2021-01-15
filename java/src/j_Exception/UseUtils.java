/**
 * Demonstrate use of exceptions in library
 * --> ���̺귯�� ���� �� ����ڰ� �ʿ��� ���� ���μ����� ������� ����ڰ� �ʿ信 �°� ����� �� �ִ��� �Ǵ��ϵ��� 
 * 		Exception�� �����ϰ� throw
 */

package j_Exception;

class ArrayUtils {
	// 1. data array���� �ִ밪�� ã�� �Լ��� ������ ���̺귯�� ����
	// 4. �� array�� �Ű������� ���������, �ܼ��� if������ error �޼����� ����ϰų� ������ return���� �����ϴ� ���� �������� �ʴ�. 
	// (���� � �������� ���̺귯���� ����� �� ��)
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
		// 2. ���̺귯�� ����ڰ� data�� ���� array�� max array�� ����
		int [] empty = new int[0];
		int maximum = ArrayUtils.max(empty);
		System.out.println("Maximum value is " + maximum);
		// 3. Error: ArrayIndexOutOfBoundsException: 0
		// 6. throw �� ���: IllegalArgumentException: Array length must be greater than zero 
		// ����ؼ� Exception�� �߻�������, ����ڰ� �ذ��ϴµ� ������ �� �ֵ��� exception ���� ����
	}
}