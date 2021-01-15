package b_Operator;

public class Operator_1 {

	public static void main(String[] args) {
		int age = 23;
		int limit = 50;
		double price = 40;
		double amount = 150;
		double hours = 7; 
		
		// Operator
//		age = age +1;
//		limit = limit -5;
//		price = price * 0.09;
//		amount = amount / 2.0;
//		hours = hours %7;
//		System.out.println(age+"/"+limit+"/"+price+"/"+amount+"/"+hours);
		// 24/45/3.5999999999999996/75.0/0.0

		// Augmented Assignment
		age += 1;
		limit -= 5;
		price *= 0.09;
		amount /= 2.0;
		hours %= 7;
		System.out.println(age+"/"+limit+"/"+price+"/"+amount+"/"+hours);
		// 24/45/3.5999999999999996/75.0/0.0
		
		// +1
		int countIncrease = 24;
		countIncrease++;
		System.out.println(countIncrease); // 25
		
		int postIncrement = countIncrease++ * 5; 
		System.out.println(postIncrement); // 125 (25 * 5)
		System.out.println(countIncrease); // 26
		
		int preIncrement = ++countIncrease * 5;
		System.out.println(preIncrement); // 135 (27 * 5)
		System.out.println(countIncrease); // 27
		
		// -1 
		int countDecrease = 5;
		countDecrease--; 
		System.out.println(countDecrease); // 4
		--countDecrease;
		
		int x = 7;
		int y = 11;
		
		int z = x-- * (++y);
		
		// 위와 같은 식
		// y = y + 1;
		// int z = x * y;
		// x = x - 1;
		
		System.out.println(z);
		
		// --> x++, --y 등은 단독으로 쓸 때만 활용하는 것이 좋다
	}

}
