/**
 * �䱸���� ������ ���� ���� Ȯ��
 * input(�Է�): ����(0~100) 
 * ��������(ó������):A+:95~,   A:90~94, 
 * 			   B+:85~89, B:80~84, 
 * 			   C+:75~79, C:70~74,
 * 			   D+:65~69, D:60~64
 * 			             F:00~59
 * output(���): ���� ��� 
 */

package c_ConditionalStatement;

import java.util.Scanner;

public class IfTest_2 {
	public static void main(String[] args) {
		//input 
		Scanner sc=new Scanner(System.in);
		System.out.print("����(0~100)�� �Է��ϼ���:");
		int inputScore=sc.nextInt();
		//ó������
		String message="F";
		
		if(inputScore>100||inputScore<0){
			System.out.println("�ùٸ� ����(0~100)�� �Է����ּ���");
			return;
		}
		if(inputScore>=95){
			message="A+";
		}else if(inputScore>=90){
			message="A";
		}else if(inputScore>=85){
			message="B+";
		}else if(inputScore>=80){
			message="B";
		}else if(inputScore>=75){
			message="C+";
		}else if(inputScore>=70){
			message="C";
		}else if(inputScore>=65){
			message="D+";
		}else if(inputScore>=60){
			message="D";
		}		
		//output
		System.out.println("����:"+inputScore+"��   ����:"+message);
	}//main
}


