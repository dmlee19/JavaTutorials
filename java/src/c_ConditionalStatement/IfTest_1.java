/**
 * �䱸���� �Է°��� ���, ����, 0���� Ȯ���ϼ���.
 * input(�Է�): �� (������ �Է��� ������ ?)- ex) 1, 0, -4, (1.5, -1.0 ������ ������ �ƴ��� Ȯ���ϰ� Ȯ��) 
 * ��������(ó������): ��� or ����  or 0 
 * output(���): Ȯ��  ex) ��� (��ü��)or ���� ���� (����� ����� ã�´�.)
 */

package c_ConditionalStatement;

public class IfTest_1 {

	public static void main(String[] args) {
		//input
		int inputData=10;    //�׽�Ʈ �Ǵ� ����, �� �ȵǴ� ����, ��Ȯ�� ���� 
		//ó������
		char message='0';
		if(inputData>0){
			message='��';
		}else if(inputData<0){
			message='��';
		}
		//output
		System.out.println("����� ���: "+message);
	}//main

}
