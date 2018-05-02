package tutorial;

public class object1 {

	//객체지향이 아닌 코드를 먼저 보자
	
	public static void sum (int left, int right) {
		System.out.println(left+right);
	}//이건 더하기 매소드
	
	public static void avg (int left, int right) {
		System.out.println(left+right/2);
	}//이건 평균구하는 메소드
	
	public static void main(String[] args) {
		
		int left = 10;
		int right = 20;
		
		sum (left,right);
		avg (left,right);
		
		left = 30;
		right = 40;
		
		sum (left,right);
		avg (left,right);
		
		/*
		 * 안 좋은 점
		 * - left 와 right 의 값이 바뀌때마다 같은 코드를 반복해줘야한다. 
		 * - 코드가 복잡해져서 메소드 sum 과 avg를 누군가 다른의도로 사용한다면? 
		 * sum 이 summary(요약)인줄 알고 잘못쓰거나 변수 left , right 의 의미를 다른 의미로 쓴다면 버그가 생길것이다.
		 * 
		 * 그렇기 때문에 이것들을 '객체지향'적으로 만들어주는것임
		 * 연관된 변수와 메소드를 클래스안에 넣어 하나로 그룹핑해줘야함.
		 * 객체지향의 개념은 어려우니까 생활코딩 참고하거나 물어보셈
		 */
		
		
	}

}
