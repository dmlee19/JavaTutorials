package e_Functions;

public class MathmaticalFunctions {

	public static void main(String[] args) {
		System.out.println(Math.exp(2));		// e^2 = 7.38905609893065
		System.out.println(Math.log(9)); 		// ln(9)= 2.1972245773362196
		System.out.println(Math.log10(1000)); 	// log10(1000) = 3.0
		System.out.println(Math.pow(2,3)); 		// 2^3 = 8.0
		System.out.println(Math.sqrt(9));		// 9^(1/2) = 3.0
		System.out.println(Math.E); 			// e = 2.718281828459045
		System.out.println(Math.sin(Math.PI/2));// sin(PI/2) = 1.0
		System.out.println(Math.cos(Math.PI)); 	// cos(PI) = -1.0
		System.out.println(Math.tan(Math.PI/4));// tan(PI/4) = 0.9999999999999999
		System.out.println(Math.PI); 			// 3.141592653589793
		System.out.println(Math.ceil(3.2)); 	// 올림 = 4
		System.out.println(Math.floor(3.8));	// 버림 = 3
		System.out.println(Math.rint(3.5)); 	// 가까운 정수(짝수) = 4
		System.out.println(Math.rint(3.2));		// 가까운 정수 = 3
		System.out.println(Math.rint(4.2));		// 가까운 정수 = 4
		System.out.println(Math.rint(4.5));		// 가까운 정수(짝수)= 4
		System.out.println(Math.rint(5.5));		// 가까운 정수(짝수)= 6
		System.out.println(Math.round(3.2));	// 반올림 = 3
		System.out.println(Math.round(3.6)); 	// = 4
		int n = (int) Math.round(2.5); 			// int로 사용 하기 위해서 (int) casting 필요
		System.out.println(Math.max(2, 6));		// 최대값 = 6
		System.out.println(Math.min(9, 5)); 	// 최소값 = 5
		System.out.println(Math.abs(-1.34)); 	// 절대 값 = 1.34
		System.out.println(Math.random()); 		// 0<= 무작위 번호  < 1.0
		System.out.println((int)(18+Math.random()*(66-18)));// 18 <= 무작위 번호  < 66
	}

}
