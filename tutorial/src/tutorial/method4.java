package tutorial;

public class method4 {

	/*
	* 이제 배열이란걸 배워보겠음. 
	* 지금까지는 int i = 0; 이런식으로 값을 담았는데 하나의 변수에 하나의 값만 담는게 아니라
	* 배열을 사용하면 하나의 변수에 여러개의 값을 담을 수도 있다.
	*/
	
	public static String[] members () { //return이 반환해야할 값의 형태가 배열이니 String[]으로만들어줌
		
		String[] member = { "구정연","구수정","죠니"};
		/*
		 * 배열의 생성 방법임. member는 배열이 담길 변수가 됨
		 * 구정연을 출력하고 싶으면 member[0]을 출력해 주면 됨 0부터 순서대로 값이 담기기때문임 
		 */
		
		return member;
	}
	
	public static void main(String[] args) {
		String[] member = members();
		
		System.out.println(member[0]); 
		
		for (int i=0; i < member.length; i++) { 
			//member.length 은 member 안에 들어간 변수의 갯수임 3개 들어있으니까 3개
			
			System.out.println(member[i]);
			
		}
		/*
		 * 이건 while과 똑같은 반복문임. for문 이라고함 
		 * ()안에 들어가는건 (초기화; 종료조건; 반복실행)임 주로 저런식으로 씀
		 * 0으로 초기화 시키고(int i = 0; 이랑 똑같음) i가 member.length(=3)보다 크면 종료시키고 
		 * {}안의 구문이 끝나면 i++ 로 하나씩 증가시킨다.
		 * 
		 */
	}
	
	//이로써 선언,초기화,반복문,배열,메소드를 한꺼번에 배웠다 복습해라 ^^ 데이터타입은 검색해서 찾아보도록
    //마지막 method5는 나중에 봐도됨. 번외 같은 개념
}
