package tutorial;

public class method2 {

	//입력값을 주면 입력을 원하는 숫자부터 출력을 원하는 숫자까지 조절 할 수있겠지?
	
	public static void numbering(int init, int limit) { //입력값(매개변수)를 2개 받아옴
		/*
		 * 입력값을 받아옴 = 매개변수를 정의 함
		 */
		int i = init; // 3이라는 매개변수가 i 안에 들어가겠지
		
		while( i < limit ) { // 9라는 매개변수가 여기서 쓰이겠지
			
			System.out.println(i);
			
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		numbering(3,9);
		//여기서 입력값음 줌 메소드를 호출할때 전달되는 값은 인자라고 함 관습적으로는 매개변수와 인자를 구별하지않고 부름
		
		//다음 : 자 그럼 이제 다른 방법으로 출력하는 법을 알아보자.
	}

}
