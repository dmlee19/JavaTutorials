/**
 * �䱸����: �Էµ� ������ ������ŭ ���
 * �Է�: 2~9 ������ ���� 2��
 * ó��: �Էµ� �������� ���ڿ� �ش��ϴ� ������
 * ���: �� ���� ���η� ��ġ�Ͽ� �ش� ������ ���
 * */

package d_Loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("�Է� ������ ����ϱ�");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ��: ");
		int inputGugu1=sc.nextInt();
		System.out.print("���� ��: ");
		int inputGugu2=sc.nextInt();
		
		if(inputGugu1<2||inputGugu1>9||inputGugu2<2||inputGugu2>9){
			System.out.println("�ùٸ� ���ڸ� �Է����ּ��� (2~9)");
		}else if(inputGugu1>inputGugu2){
			System.out.println("��Ģ(���� ��>=���� ��)�� �°� �Է����ּ���");
		}else {for(int i=1;i<10;i++){
		
				for(int j=inputGugu1;j<inputGugu2+1;j++){
				System.out.print(j+" * "+i+" = "+i*j+"\t");
				}// 1-1 for
				System.out.println();
			}// 1 for
		}//else
	}//main
}//end