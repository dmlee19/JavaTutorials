/**
 * 요구사항 입력값이 양수, 음수, 0인지 확인하세요.
 * input(입력): 값 (무엇을 입력할 것인지 ?)- ex) 1, 0, -4, (1.5, -1.0 포함할 것인지 아닌지 확실하게 확인) 
 * 구현내용(처리내용): 양수 or 음수  or 0 
 * output(출력): 확인  ex) 출력 (자체적)or 값을 전달 (출력할 대상을 찾는다.)
 */

package c_ConditionalStatement;

public class IfTest_1 {

	public static void main(String[] args) {
		//input
		int inputData=10;    //테스트 되는 조건, 꼭 안되는 조건, 명확한 조건 
		//처리내용
		char message='0';
		if(inputData>0){
			message='양';
		}else if(inputData<0){
			message='음';
		}
		//output
		System.out.println("결과를 출력: "+message);
	}//main

}
