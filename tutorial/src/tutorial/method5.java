package tutorial;

import java.io.*;
import java.util.Scanner;

public class method5 {

	public static void main(String[] args) {
		
	
	try {
		File file = new File("out.txt");
		//out.txt 를 불러옴
		Scanner sc = new Scanner(file);
		//자바 라이브러리중 scanner 를 이용함 file을 읽어옴
		while(sc.hasNextInt()) { 
		//sc.hasNextInt 는 입력값이 생기기 전까지 실행을 유보함 숫자형의 경우만 true 리턴
			System.out.println(sc.nextInt()*1000);
		}		
		sc.close();
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	}
}
