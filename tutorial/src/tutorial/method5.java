package tutorial;

import java.io.*;
import java.util.Scanner;

public class method5 {

	public static void main(String[] args) {
		
	
	try {
		File file = new File("out.txt");
		//out.txt �� �ҷ���
		Scanner sc = new Scanner(file);
		//�ڹ� ���̺귯���� scanner �� �̿��� file�� �о��
		while(sc.hasNextInt()) { 
		//sc.hasNextInt �� �Է°��� ����� ������ ������ ������ �������� ��츸 true ����
			System.out.println(sc.nextInt()*1000);
		}		
		sc.close();
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	}
}
