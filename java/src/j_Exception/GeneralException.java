/**
 * Dividing program
 * Using Exception to catch any sort of exception.
 * ���� �� �� �ִ� Exception 2���� 
 * 1. InputMismatchException (���ڷ� ���� �Է��ϴ� ��� _ one, nineteen ��)
 * 2. ArithmeticException (0���� ������ ���_divisor = 0)
 */

package j_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeneralException {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Dividing numbers");

			System.out.print("Enter the dinidend: ");
			int dividend = input.nextInt();

			System.out.print("Enter the divisor: ");
			int divisor = input.nextInt();
			// ArithmeticException�� catch �ϴ� ��� 
			if(divisor != 0){
				System.out.printf("Quotient: %d\n", dividend / divisor);
				System.out.printf("Reminder: %d\n", dividend % divisor);				
			}else{
				System.out.println("You can't divide by zero.");
			}
		}
		catch (InputMismatchException ex){
			System.out.println("Please use digit only.");
		} // �پ��� �Է� ���� ���� exception�� if������ �������Ⱑ ����
//		catch (ArithmeticException ex){
//			System.out.println("Division by zero is not allowed.");
//		} // ArithmeticException �� ��� ���� �ʴ´�. ���� �޼����� ���� ���ٴ� if ������ 0�Է��� ������ �� �ֱ⶧���� �����ϰ� �ذ� ����
		catch (Exception ex){
			System.out.println("Error in program.");
		} // Exception: ��κ� Exception�� �θ� Ŭ���� (java.lang package�� ���ؼ� import���� �ʾƵ� ��� ����)
		  // ex = catch block������ ���̴� local variable --> ���� ��� exception�� ���� �ĺ��� ��� ���� (compile ���� X)
		  // ������ Ư�� Exception�� �����ϰ� ��Ȳ�� �´� ������ �Ұ��� (������ Exception �߰� �ʿ�)
		  // �ۼ��� catch���� ������� exception�� üũ  (General Exception�� ���� �������� ��ġ)
	}// main
}
