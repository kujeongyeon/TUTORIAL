package tutorial;

import java.io.*;

public class method3 {

	public static String numbering (int init, int limit) {
		
		int i = init;
		String output = ""; //숫자를 담기 위해 빈 값을 넣어준다.
		
		/*
		 * String도 int같은 데이터 타입임
		 * 숫자가 아닌 문자를 담는 그릇이라고 이해하면된다. 
		 */
		
		while( i < limit ) {
			
			output += i; //숫자를 화면에 출력하는 대신 변수 output 에 담음 
			
			i++;
			
		}
		
		return output; //return 으로 output 을 출력 
		
		/*
		 *  return 을 통해서 반환할 값의 데이터형식을 public static 뒤에 꼭 써주어야한다. 규칙임
		 *  이렇게 함으로써 얻을수있는 장점은 메소드만 봐도 어떤 값으로 출력될지 알수있다는점
		 *  String이 앞에 붙어있으면 문자가 출력되겠군. int가 붙어있으면 숫자가 붙어있겠군!
		 *  
		 *  return 의 역활 
		 *  1. 값을 반환한다 
		 *  2. 메소드를 중단 시킴 = 리턴이 등장한 이후의 구문은 실행되지 X 
		 */
	}
	
	public static void main(String[] args) {
		
		String result = numbering(3,9); //메소드 numbering 이 변수 result에 담김
		
		System.out.println(result);

		/*
		 * 굳이 이런식으로 return 으로 출력 하는 이유?
		 * 부품으로써의 가치를 높이기 위해서임 만약 출력이 아니라 파일에 기록하고 싶다면?
		 * 메소드를 기능에 맞게 따로 만들어줄수도 있겠지만 출력과 기록 등으로 부터 로직을 분리해주는것이 좋다
		 * 
		 */
		
		try { //예외처리라고 하는데 일단 무시하셈
			
			//out.txt 라는 파일에 result 의 반환된 값을 저장함 (화면에 출력하는것이 아닌 처리결과를 반환함)
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
			//아직 이것을 이해하려하지 마셈 그냥 out.txt라는 텍스트 파일을 만들어주는구나 생각
		}catch(IOException e) {
			
		}
		
		//실행시키고 tutorial 을 f5를 눌러서 새로고침하면 out.txt파일이 생길거임
		
		//다음 : 하나의 메소드는 return으로 하나의 값만을 반환할 수 있다. 여러개를 반환 할 수는 없을까? 
	}

}
