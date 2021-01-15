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
		
		try ( // �Ұ�ȣ �ȿ� ����
			Scanner input = new Scanner(inFile);
			PrintWriter output = new PrintWriter(outFile);
		)
//			Scanner input = new Scanner(inFile);
//			PrintWriter output = new PrintWriter(outFile);
//			// FileNotFoundException �ʼ�(Scanner(file)�� ����)
		{ // �����δ� �߰�ȣ�� 
			while(input.hasNext()){
				String line = input.nextLine();
				String [] nameParts = line.split(" ");
				String newName = nameParts[1]+ ", " + nameParts[0];
				output.write(newName + "\n"); // �� �ٲ��� ���� �־����
			}
			// try() �Ұ�ȿ �ȿ� Scanner�� PrintWriter�� �ְ�
			// Exception���� ����� ��  try catch ������ ��� ����Ǹ� JAVA���� �ڵ����� close ����
//			input.close(); // input file�� ����.
//			output.close(); // *�߿�* output file �ݾƾ���
			// java���� PrintWrite�� ��, buffer�� �� ���� ��ũ�� ����
			// PrintWrite�� �ݾƾ� buffer�� �� ���� �ʾƵ� ����� Data�� ��ũ�� ����
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// ���� �� ȭ�鿡 ��µǴ� ���� ����. ��¹��� ��� switched_people.txt�� ����.
		// people.txt�� �̸� �߰� --> �����
		// switch_people.txt �� ���� �����Ǿ� ������ ������ ���
		// ���� ���� �ȴٸ� if���� �̿��Ͽ� File.exists() �Լ� ���
	}

}
