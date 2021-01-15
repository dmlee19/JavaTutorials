/**
 * Dividing program
 * Using Exception to catch any sort of exception.
 * 예상 할 수 있는 Exception 2가지 
 * 1. InputMismatchException (문자로 숫자 입력하는 경우 _ one, nineteen 등)
 * 2. ArithmeticException (0으로 나누는 경우_divisor = 0)
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
			// ArithmeticException을 catch 하는 대신 
			if(divisor != 0){
				System.out.printf("Quotient: %d\n", dividend / divisor);
				System.out.printf("Reminder: %d\n", dividend % divisor);				
			}else{
				System.out.println("You can't divide by zero.");
			}
		}
		catch (InputMismatchException ex){
			System.out.println("Please use digit only.");
		} // 다양한 입력 값에 대한 exception은 if문으로 가려내기가 힘듦
//		catch (ArithmeticException ex){
//			System.out.println("Division by zero is not allowed.");
//		} // ArithmeticException 잘 사용 하지 않는다. 에러 메세지를 띄우기 보다는 if 문으로 0입력을 가려낼 수 있기때문에 간단하게 해결 가능
		catch (Exception ex){
			System.out.println("Error in program.");
		} // Exception: 대부분 Exception의 부모 클래스 (java.lang package에 속해서 import하지 않아도 사용 가능)
		  // ex = catch block에서만 쓰이는 local variable --> 따라서 모든 exception에 같은 식별자 사용 가능 (compile 문제 X)
		  // 각각의 특정 Exception을 구분하고 상황에 맞는 대응이 불가능 (각각의 Exception 추가 필요)
		  // 작성한 catch문의 순서대로 exception을 체크  (General Exception은 가장 마지막에 위치)
	}// main
}
