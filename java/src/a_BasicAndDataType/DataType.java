package a_BasicAndDataType;

public class DataType {

	public static void main(String[] args) {
		//���� - ������(���)
		int num1=10;
		byte num2 = 10; //VM�� ���� ������ �϶��� ���� üũ - ����
		
		num1 = num2; // ���� 4byte = 1byte �ڵ�����ȯ
		//X num2 = num1; // ���� 1byte = 4byte ������ ���� (�����Ϸ��� ã��)
		num2 = (byte)num1; //�� ��ȯ�� ���ؼ� ��������� ĳ�����Ѵ�. (Ÿ��ĳ����: num1�� byte�� �־ ������ ���ٰ� ����) 
		
		//byte num3=128; // byte �ִ밪 127���� ũ�� ������
		System.out.println(Byte.MAX_VALUE); //����� ���� ���:�빮�ڷ� ǥ��
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Byte.MAX_VALUE+1); //byte + 1(int) = int
		System.out.println(Short.MAX_VALUE+1); // short + 1(int) = int
		System.out.println(Integer.MAX_VALUE+1); // int+ 1(int) = �ּҰ� 2���� 1111111111111111
		System.out.println(Integer.MAX_VALUE+1L); // int + 1(long) = long

		//���� - ���� 
		char c1='A'; 
		System.out.println(c1);	// A
		char c2=66; //������ ���� Ÿ������ ���ڸ� ��Ÿ����. ������ �ڵ尪�� ���� VM�� �˾Ƽ� ���ش�.
		System.out.println(c2); // B
		char c3= '��';
		System.out.println((int)c3); // 54620
		System.out.println(Short.MAX_VALUE); // short �� char�� 2byte�� ������ short ������ �Ѿ��
		System.out.println(c3+1);	// 54621
		System.out.println((char)(c3+1)); //���ڵ� ����ó�� ����ؼ� �̿밡��	(��)
		System.out.println(Character.MAX_VALUE); //char�� �ִ밪�� �ǹ̰� ����
			
		//�Ǽ� - �ٻ簪
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE+1);//�ٻ簪�̱� ������ 1�� ���ϴ� ���� ũ�� �ǹ̰� ����. 
		System.out.println(Double.MAX_VALUE);
		
		float f1=10;
		//float f2=10.0; // X 10.0�� double(8byte)
		float f3=10.0F;
		
		System.out.println(Float.MAX_VALUE+1);
		System.out.println(Float.MAX_VALUE+1D); // float���� double�� ����ȯ ���� 1�� �������� ���� (�ٻ簪)
	
	}// main

}
