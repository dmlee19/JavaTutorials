package b_Operator;

public class Operator_2 {

	public static void main(String[] args) {
		int num1=10, num2=10, num3=10;
		/*비교 연산자는 결과를 boolean(true/false)형으로 나타낸다*/
		System.out.println(num1 == num2);	         /* 10==10*/
		System.out.println(num1 == num3);           /* 값만 비교 이론적으로는 다르다(정수vs문자)*/
		System.out.println(num1+1 == num3+1);       /* 11 vs "101"*/

		System.out.println(true == false);
		
		System.out.println(num1 != num3);           /*값이 같지 않다.*/
		
		System.out.println(10 <= 10);
		
		/*논리연산자 - 다중조건 확인 (연상대상이 boolean형만 가능)*/
		System.out.println(num1>=10 && num2>=10); /* A and B 모두 True일 경우만 True*/
		System.out.println(num1>=10 && num2>10);  /*하나라도 True가 아니면 False*/
		System.out.println(num1>=10 || num2>10);  /*A or B 1개만 True인 경우 True*/
		
		System.out.println(num1 !=10 && ++num2>10); 
		/*결과:False 이유: 10=10 false && 결과와 상관없이 False 
		                               num2에 접근할 필요가 없음 - 수행안함(둘 다 True인 경우만 True)
		               num1=10, num2=10 (전치연산에 접근 안함)*/
		System.out.println(num1 !=10 || ++num2>10); 
		/*결과:True 이유: 10=10 false || 11>10 Ture(둘 중 하나만 True인 경우 True)
		     num1에서 False가 나왔으므로 뒤에까지 확인을 해봐야함 ++num2에 접근
		      num1=10, num2=11 (전치연산에 접근 )*/
		System.out.println(num1==10 || num2++>10);
		/*결과:True 이유: 앞에 num1 True이므로 num2와 관계없이 True (접근할 필요 없음) 
		      num1=10, num2=11 (전치연산에 접근안함)*/

	}

}
