package tutorial;

/*
 * overriding (오버라이딩) 
 * 하위클래스(자식클래스) 는 상위클래스의 메소드를 그 기능 그대로 사용할 필요가 없다. 
 * overriding 을 사용하면 상위클래스의 메소드 기능을 변경할수있다.
 * 
 * = 상위클래스의 메소드를 재정의해서 사용하는 기술
 */

class Calculator4 {
	
	int left, right ;
	
	public Calculator4 (int left , int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum () {
		System.out.println(this.left + this.right);
	}
	public void avg () {
		System.out.println(this.left + this.right / 2);
	}
	public int avg2 () {
		return ((this.left + this.right)/2);
	}
	
}

class SubtractCalculator extends Calculator4{

	public SubtractCalculator(int left, int right) {
		super(left, right);
	}
	
	public void sum () {
		
		int sum = this.left + this.right ;
		System.out.println("실행결과는 " + sum + " 이다.");
		
		/*
		 * 하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 
		 * 부모 클래스로부터 물려 받은 기본 동작 방법을 변경하는 효과를 갖게 된다. 
		 * 기본동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선순위를 갖게하고 있다.
		 */
	}
	
	/*
	 *  overriding 의 조건
	 *  1. 메소드의 리턴 형식이 같아야 한다. 부모는 avg 가 void 인데 자식은 int 로 리턴할수없다.
	 *  2. 메소드 이름이 같아야 한다. 
	 *  3. 메소드의 매개변수의 숫자와 데이터 타입 그리고 순서가 같아야함
	 *  => 이 조건을 통틀어 메소드의 서명이라고 한다.
	 */


	 public int avg () {
		return (this.left + this.right)/2 ;
	} 
	 
	  // 리턴 타입이 달라서 안됨
	  
	
	public int avg2 () {
		return super.avg2();		
	}
	
	 // 로직이 중복되지 않으려면 super 를 써주면됨 
}

public class overriding {

	public static void main(String[] args) {
		
		SubtractCalculator c1 = new SubtractCalculator (20 ,30); 
		c1.sum();
		
	}

}
