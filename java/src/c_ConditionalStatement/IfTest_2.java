/**
 * 요구사항 점수에 따른 학점 확인
 * input(입력): 점수(0~100) 
 * 구현내용(처리내용):A+:95~,   A:90~94, 
 * 			   B+:85~89, B:80~84, 
 * 			   C+:75~79, C:70~74,
 * 			   D+:65~69, D:60~64
 * 			             F:00~59
 * output(출력): 학점 출력 
 */

package c_ConditionalStatement;

import java.util.Scanner;

public class IfTest_2 {
	public static void main(String[] args) {
		//input 
		Scanner sc=new Scanner(System.in);
		System.out.print("점수(0~100)를 입력하세요:");
		int inputScore=sc.nextInt();
		//처리내용
		String message="F";
		
		if(inputScore>100||inputScore<0){
			System.out.println("올바른 점수(0~100)를 입력해주세요");
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
		System.out.println("점수:"+inputScore+"점   학점:"+message);
	}//main
}


