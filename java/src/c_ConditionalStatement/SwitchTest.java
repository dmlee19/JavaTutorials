/** 
 * �䱸���� �� �Է� �ش� ���� �� �ϼ��� Ȯ�� 
 * input(�Է�): �ð� (0~23) 
 * ��������(ó������): 1�� (31��),2�� (28��),.....,12��(31��)
 * output(���): �� �ϼ� Ȯ��  ��� 
 */

package c_ConditionalStatement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		//input 
		Scanner sc=new Scanner(System.in);
		System.out.print("��ȸ�� ��(1~12)�� �Է��ϼ���:");
		int inputData=sc.nextInt();
		//ó������
		String message="31";
		
		if(inputData<1||inputData>12){
			System.out.println("�ùٸ� ��(1~12)�� �Է����ּ���");
			return;
		}
		switch(inputData){
			case 2:
				message="28";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				message="30";
				break;		
		}
		//output
		System.out.println(inputData+"���� "+message+"�ϱ��� �ֽ��ϴ�.");
	}//main

}
