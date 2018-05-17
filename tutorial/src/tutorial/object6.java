package tutorial;

/*
 * 생성자와 상속
 * 
 */

class Calculator3 {
	
	int left , right ;
	
	public Calculator3 (int left , int right) {
		
		this.left = left ;
		this.right = right ;
		
	}
	
	public void sum () {
		System.out.println(this.left + this.right);
	}
	public void avg () {
		System.out.println(this.left + this.right / 2 );
	}
	
}

class subtractCalculator2 extends Calculator3 {
	
	/*
	 * 생성자가 포함된 클래스를 상속받으면 생성자도 같이 생성해줘야함
	 */
	int middle ;
	
	public subtractCalculator2(int left, int right , int middle) {
		
		super(left, right);		
		//super는 상위클래스를 가르키는 키워드임 부모 상속자의 생성자를 간단하게 정의 가능 
		//새로운 생성자를 생성하려면 이 밑에 생성자를 정의해 주어야함 
		this.middle = middle;
	}
	/*
	 * 하위 클래스가 호출될 때 자동으로 상위 클래스의 기본 생성자를 호출하게 된다. 
	 * 그런데 상위 클래스에 매개변수가 있는 생성자가 있다면 자바는 자동으로 상위 클래스의 
	 * 기본 생성자를 만들어주지 않는다.
	 */

	public void subtract () {
		System.out.println( (this.left - this.right) * this.middle);
	}
}


public class object6 {
	public static void main(String[] args) {
		
		subtractCalculator2 c1 = new subtractCalculator2(20 , 10, 5);
		c1.subtract();
	}
	
}
