package tutorial;

/*
 * '클래스'를 만들어줌
 * sum 과 avg 의 기능은 '게산'을한다는 점에서 비슷한 기능을 가지고 있지
 * 그래서 이것들을 묶어주고 싶음 Calculator (계산기) 라고 이름을 붙여서 클래스로 묶어주자
 */
class Calculator {
	
	//'생성자' 만들어줌 : 객체를 생성할 때 호출됨 
	// 왜 만들어주냐? 객체지향의 초기화에 해당한다
	int left , right;
	
	public Calculator(int left, int right) { 
	//인스턴스(객체) 생성할때 left,right 값을 꼭 입력하도록 강제
		this.left = left;
		this.right = right;
	/*
	 * [이건 object4 본다음에 보셈]
	 * this 는 메소드 내부에서 인스턴스 변수에 접근할 수 있도록 해주는 것임
	 * 같은 이름의 변수면 메소드 내부에서는 지역변수가 우선이라 this 로 인스턴스 변수(전역변수)를 가져오는거임
	 */
	}
	/*
	 * 생성자 특징임
	 * 객체 생성 과정에서 left 와 right의 값을 설정하는 과정을 강제 할수있다. -> main 메서드 아래 보셈
	 * 반환값이 없음 -> return 이 없지? 생성자는 인스턴스(객체)를 생성해주는 특수한 메소드라 그럼
	 * 생성자의 이름은 클래스와 동일하게 만들어준다.
	 */
	
	public void sum () {
		System.out.println(this.left + this.right);
	}//더하기
	public void avg () {
		System.out.println(this.left + this.right / 2 );
	}//평균
	
	
	//생성자는 여러개 만들어줄수도 있음 middle 이란 매개변수를 추가해서 초기화 해주자
	int middle ;
	
	public Calculator (int left , int middle , int right) {
		
		this.left = left ;
		this.middle = middle;
		this.right = right;
	}
	
	public void sum1 () {
		System.out.println(this.left + this.middle + this.right);
	}
	public void avg1 () {
		System.out.println(this.left + this.middle + this.right / 3 );
	}
	
}

public class object2 {
	
	public static void main(String[] args) {
		
		//인스턴스(객체) 생성 방법임 new Calculator()로 객체를 만들어줌 이렇게 만들어진 Calculator 의 '인스턴스' 라고함
		Calculator cal = new Calculator(20,30); 
		/*
		 * 이렇게 인스턴스를 생성할때 left 와 right 값을 입력하도록 강제함 (생성자의 특징)
		 * 이렇게 강제 하면 실행했을때의 오류를 줄일수있겠지? 만약 강제하지 않으면 
		 * 인자를 안넣거나 아님 더 넣거나 하는 잘못된 값을 입력한 상황에서 오류를 알아차리기 힘듬
		 * 
		 * cal 이라는 변수 선언할때 데이터 타입을 보셈 Calculator 지? 
		 * 내가 만든 클래스가 데이터 타입(사용자 정의 데이터 타입이라고함)이된
		 * 변수에 new Calculator 로 인스턴스(객체)를 만들어준거임
		 * 
		 */
		cal.sum();
		cal.avg();
		
		
		Calculator cal1 = new Calculator(20,30,40);
		cal1.sum1();
		cal1.avg1();
	}

}
