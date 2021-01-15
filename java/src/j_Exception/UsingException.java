/**
 * ��� ���� ��Ȳ�� Exception�� ���⺸�ٴ� 
 * ��Ȳ�� ���� If������ �ذ� ����(����, �ý��������� ����) 
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
			// if ���� �̿��ؼ� �迭 ���� ���� �� �Է¿� ���� ���� �ذ�
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
