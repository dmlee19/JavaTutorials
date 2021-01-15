/**
 * Read file people.txt, change the names in it
 * to last name first, and write the resulting list
 * to switched_people.txt 
 */

package k_FileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; // output
import java.util.Scanner;

public class NameSwitcher {

	public static void main(String[] args) {
		File inFile = new File("people.txt");
		File outFile = new File("switched_people.txt");
		
		try ( // 소괄호 안에 넣음
			Scanner input = new Scanner(inFile);
			PrintWriter output = new PrintWriter(outFile);
		)
//			Scanner input = new Scanner(inFile);
//			PrintWriter output = new PrintWriter(outFile);
//			// FileNotFoundException 필수(Scanner(file)과 동일)
		{ // 구현부는 중괄호에 
			while(input.hasNext()){
				String line = input.nextLine();
				String [] nameParts = line.split(" ");
				String newName = nameParts[1]+ ", " + nameParts[0];
				output.write(newName + "\n"); // 줄 바꿈은 직접 넣어야함
			}
			// try() 소괄효 안에 Scanner와 PrintWriter를 넣고
			// Exception없이 실행된 후  try catch 구현부 모두 실행되면 JAVA에서 자동으로 close 해줌
//			input.close(); // input file을 닫음.
//			output.close(); // *중요* output file 닫아야함
			// java에서 PrintWrite할 때, buffer가 꽉 찰떄 디스크에 저장
			// PrintWrite를 닫아야 buffer가 꽉 차지 않아도 저장된 Data를 디스크에 저장
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// 실행 시 화면에 출력되는 것은 없다. 출력문은 모두 switched_people.txt에 저장.
		// people.txt에 이름 추가 --> 재실행
		// switch_people.txt 가 새로 생성되어 기존에 파일을 덮어씀
		// 덮어 쓰기 싫다면 if문을 이용하여 File.exists() 함수 사용
	}

}
