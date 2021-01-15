package e_Functions;

public class CharacterFunctions {

	public static void main(String[] args) {
//		ASCII
//		A merican
//		S tandard
//		C ode for
//		I nformation
//		I nterchange
		int i1 = 'a';
		int i2 = 'A';
		int i3 = '!';
		int i4 = '5';
		System.out.println(i1);	// 97
		System.out.println(i2);	// 65
		System.out.println(i3); // 33
		System.out.println(i4); // 53

// 		Using Hexadecimal (16)
		
//		String
		String twoLines = "abc\ndef";
		System.out.println(twoLines); // abc
									  // def
		String greet = "She said \"Hi\" to us.";
		System.out.println(greet); //She said "Hi" to us.
		
		char capitalA = Character.toUpperCase('a');
		String message = "example";
		String capitalized = message.toUpperCase();
		System.out.println(capitalA);		// A
		System.out.println(message);		// example
		System.out.println(capitalized);	// EXAMPLE
		
		String emptyString = "";
		String userName = "   \t Iron man \n   ";
		System.out.println("o" + userName + "o");// o   	 Iron man 
		   										 //	   o
												 // 공백 까지 모두 문자열로 저장
		
		System.out.println("o" + userName.trim() + "o"); // oIron mano (공백 제거)
		
//		Comparing Strings
		String word1 = "Java";
		System.out.println(word1.equals("Java"));	// true
		System.out.println(word1.equals("Python"));	// false
		System.out.println("Java".equals("Java"));	// true
		System.out.println("Java".equals("java"));	// false
		System.out.println("Java".equalsIgnoreCase("Java"));	// true
		System.out.println("Java".equalsIgnoreCase("jAVa"));	// true
		
		System.out.println("cat".compareTo("Dog")); 			// 31 (positive -> greater than)
		System.out.println("cat".compareToIgnoreCase("Dog")); 	// -1 (negative -> less than)
		System.out.println("cat".compareToIgnoreCase("CAT")); 	// 0 (zero -> equal)
		
//		substring(start) / substring(start,end) -> not include end
		String word = "flashpoint";
		System.out.println(word.substring(5));	//point
		System.out.println(word.substring(2,5));//ash
		
//		indexOf()
		//f l a s h p o i n t
		//0 1 2 3 4 5 6 7 8 9
		System.out.println(word.indexOf("la"));		// 1	첫번째 문자 기준
		System.out.println(word.indexOf("h"));		// 4
		System.out.println(word.indexOf('x'));		// -1	없는 경우
		System.out.println(word.indexOf("index"));	// -1

//		indexOf('char',start)
		// b a n a n a s
		// 0 1 2 3 4 5 6
		String word2 = "bananas";
		System.out.println(word2.indexOf('n', 3));	// 4	3번째 이후에 첫번째 'n'위치 
		System.out.println(word2.indexOf("an", 2));	// 3
		System.out.println(word2.indexOf('n', 5));	// -1	없는 경우
		System.out.println(word2.indexOf("an", 4));	// -1	
		
//		lastIndexOf() //뒤에서 시작해서 가장 먼저 확인되는 자리 
		System.out.println(word2.indexOf('a'));		// 1 (앞을 기준으로 첫번째 'a'위치)
		System.out.println(word2.lastIndexOf('a'));	// 5 (뒤를 기준으로 첫번째 'a'위치)
		
		
//		list가 한개 또는 두개, 세개 까지 구분해서 출력 가능
		
		//String commaSeparatedList = "cat";
		//String commaSeparatedList = "cat, dog";
		String commaSeparatedList = "cat, dog, horse";
		String fistWord="";
		String secondWord="";
		String thirdWord="";
		
		int firstComma = commaSeparatedList.indexOf(",");
		if(firstComma >= 0){
			fistWord = commaSeparatedList.substring(0,firstComma);
			int secondComma = commaSeparatedList.indexOf(",",firstComma+1);
			if(secondComma >= 0){
				secondWord = commaSeparatedList.substring(firstComma+1,secondComma);
				thirdWord= commaSeparatedList.substring(secondComma+1);		// to end
			}else
				secondWord = commaSeparatedList.substring(firstComma+1);	// to end
		}else{
			word1 = commaSeparatedList;
		}
		
		System.out.println(fistWord.trim());
		System.out.println(secondWord.trim());
		System.out.println(thirdWord.trim());
		
	}

}
