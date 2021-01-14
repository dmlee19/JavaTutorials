package a_BasicAndDataType;

public class DataType {

	public static void main(String[] args) {
		//정수 - 고정값(상수)
		int num1=10;
		byte num2 = 10; //VM이 정수 고정값 일때만 범위 체크 - 예외
		
		num1 = num2; // 변수 4byte = 1byte 자동형변환
		//X num2 = num1; // 변수 1byte = 4byte 컴파일 오류 (컴파일러가 찾음)
		num2 = (byte)num1; //형 변환을 위해서 명시적으로 캐스팅한다. (타입캐스팅: num1을 byte에 넣어도 문제가 없다고 지시) 
		
		//byte num3=128; // byte 최대값 127보다 크기 때문에
		System.out.println(Byte.MAX_VALUE); //사용자 정의 상수:대문자로 표기
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Byte.MAX_VALUE+1); //byte + 1(int) = int
		System.out.println(Short.MAX_VALUE+1); // short + 1(int) = int
		System.out.println(Integer.MAX_VALUE+1); // int+ 1(int) = 최소값 2진수 1111111111111111
		System.out.println(Integer.MAX_VALUE+1L); // int + 1(long) = long

		//문자 - 정수 
		char c1='A'; 
		System.out.println(c1);	// A
		char c2=66; //정수의 문자 타입으로 문자를 나타낸다. 문자의 코드값은 고정 VM이 알아서 해준다.
		System.out.println(c2); // B
		char c3= '한';
		System.out.println((int)c3); // 54620
		System.out.println(Short.MAX_VALUE); // short 와 char은 2byte로 같지만 short 범위를 넘어간다
		System.out.println(c3+1);	// 54621
		System.out.println((char)(c3+1)); //문자도 숫자처럼 계산해서 이용가능	(핝)
		System.out.println(Character.MAX_VALUE); //char의 최대값은 의미가 없다
			
		//실수 - 근사값
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE+1);//근사값이기 때문에 1을 더하는 것은 크게 의미가 없다. 
		System.out.println(Double.MAX_VALUE);
		
		float f1=10;
		//float f2=10.0; // X 10.0은 double(8byte)
		float f3=10.0F;
		
		System.out.println(Float.MAX_VALUE+1);
		System.out.println(Float.MAX_VALUE+1D); // float에서 double로 형변환 실제 1일 더해지지 않음 (근사값)
	
	}// main

}
