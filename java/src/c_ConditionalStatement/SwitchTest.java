/** 
 * 요구사항 월 입력 해당 월에 총 일수를 확인 
 * input(입력): 시간 (0~23) 
 * 구현내용(처리내용): 1월 (31일),2월 (28일),.....,12월(31일)
 * output(출력): 총 일수 확인  출력 
 */

package c_ConditionalStatement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		//input 
		Scanner sc=new Scanner(System.in);
		System.out.print("조회할 월(1~12)을 입력하세요:");
		int inputData=sc.nextInt();
		//처리내용
		String message="31";
		
		if(inputData<1||inputData>12){
			System.out.println("올바른 값(1~12)을 입력해주세요");
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
		System.out.println(inputData+"월은 "+message+"일까지 있습니다.");
	}//main

}
