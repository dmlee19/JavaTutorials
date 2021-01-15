package d_Loop;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
//		int n = 0;
//		int sumsq = 0;
//		
//		while (sumsq <100){
//			n++;
//			sumsq = sumsq + (n * n);
//			System.out.println(n+ " " + sumsq);
//		}
//		System.out.printf("The sum of squares up to %d is %d\n", n, sumsq);

/**
* Input with while loop
* Ask user for a year and tell them whether it is a leap year or not
* do this until the user gives us zero for the year 
*/
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a year of zero to quit: ");
//		int year = input.nextInt();
//		
//		while(year!=0){
//			if((year % 4 == 0 && year % 100 !=0)||(year%400 ==0)){
//				System.out.printf("%d is a leap year\n", year);				
//			}else{
//				System.out.printf("%d is not a leap year\n", year);
//			}
//			System.out.print("Enter another year, or zero to quit: ");
//			year = input.nextInt();
//		}//while
//		System.out.println("Finished");
		
/**
 * input loops controlled by Booleans
 * 한번의 input 사용으로 계속해서 입력 가능 (중복 제거)
 */		
	
//		int year;
//		boolean finished = false;
//		
//		while(!finished){
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter a year of zero to quit: ");
//			year = input.nextInt();
//			if(year != 0){
//				if((year % 4 == 0 && year % 100 !=0)||(year%400 ==0)){
//					System.out.printf("%d is a leap year\n", year);				
//				}else{
//					System.out.printf("%d is not a leap year\n", year);
//				}	
//			}else{
//				finished = true;
//			}			
//		}//while
//		System.out.println("Finished");
		
/**
 * do/while //첫번째 loop은 무조건 실행
 */		
		
		int year;
		
		do{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a year of zero to quit: ");
			year = input.nextInt();
			if(year != 0){
				if((year % 4 == 0 && year % 100 !=0)||(year%400 ==0)){
					System.out.printf("%d is a leap year\n", year);				
				}else{
					System.out.printf("%d is not a leap year\n", year);
				}
			}
		}while(year!=0);
		System.out.println("Finished");
	}//main

}
