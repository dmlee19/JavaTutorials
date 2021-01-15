/**
 * 요구사항: 입력된 구구단 범위만큼 출력
 * 입력: 2~9 범위의 숫자 2개
 * 처리: 입력된 범위안의 숫자에 해당하는 구구단
 * 출력: 각 단을 가로로 배치하여 해당 구구단 출력
 * */

package d_Loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("입력 구구단 출력하기");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("시작 단: ");
		int inputGugu1=sc.nextInt();
		System.out.print("종료 단: ");
		int inputGugu2=sc.nextInt();
		
		if(inputGugu1<2||inputGugu1>9||inputGugu2<2||inputGugu2>9){
			System.out.println("올바른 숫자를 입력해주세요 (2~9)");
		}else if(inputGugu1>inputGugu2){
			System.out.println("규칙(시작 단>=종료 단)에 맞게 입력해주세요");
		}else {for(int i=1;i<10;i++){
		
				for(int j=inputGugu1;j<inputGugu2+1;j++){
				System.out.print(j+" * "+i+" = "+i*j+"\t");
				}// 1-1 for
				System.out.println();
			}// 1 for
		}//else
	}//main
}//end