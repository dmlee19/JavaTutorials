/**
 * 모든 예외 상황에 Exception을 쓰기보다는 
 * 상황에 따라 If문으로 해결 가능(업무, 시스템적으로 좋음) 
 */

package j_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingException {

	public static void main(String[] args) {
		String[] words = {"ant", "bee", "cat", "dog"};

		Scanner input = new Scanner(System.in);
		try{
			System.out.print("Enter an index: ");
			int index = input.nextInt();
			// if 문을 이용해서 배열 범위 밖의 값 입력에 대한 문제 해결
			if(index >= 0 && index < words.length){
				String result = words[index];
				System.out.printf("the word is %s.\n", words[index]);
			}else{
				System.out.printf("Use a number from 0 to %d", (words.length-1));
			}
			
//			String result = words[index];
//			System.out.printf("the word is %s.\n", words[index]);
		}
//		catch(IndexOutOfBoundsException ex){
//			System.out.printf("Use a number from 0 to %d", (words.length-1));
//		}
		catch(InputMismatchException ex){
			System.out.println("Please use digit only.");
		}
		input.close();
	}

}
