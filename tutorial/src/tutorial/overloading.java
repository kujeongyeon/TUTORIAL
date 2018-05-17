package tutorial;

/*
 * overloading (오버로딩)
 * 같은 이름의 메소드를 중복해 선언하면서 매개변수의 유형과 갯수가 다르도록하는 기술
 */
class Calculator5 {
	
	int left, right, middle;
	
	public Calculator5 (int left ,int right) {
		this.left = left;
		this.right =right;
	}
	
	public Calculator5 (int left, int right, int middle) {
		this.left = left;
		this.right = right;
		this.middle = middle;
	}
	
	/*
	 * 오버로딩은 매개변수가 달라지면 이름이 같아서 서로 다른 메소드가 된다.
	 * 
	 * 오버로딩의 규칙
	 * 1.리턴타입이 같아야 한다
	 */
	
	public void sum () {
		System.out.println(this.left + this.right);
	}
	
	//public int sum () {
	//	return (this.left + this.right + this.middle);
	//}
	// 리턴타입이 달라서 안됨
	
	public void sum (int x) {
		System.out.println(this.left + this.right + x);
	}
	
	public void avg () {
		System.out.println(this.left + this.right / 2 );
	}
}

	class SubtractCalculator extends Calculator5 {

		public SubtractCalculator(int left, int right) {
			super(left, right);
		
		}
		
		
		public void sum (String str) {
			System.out.println(this.left + this.right + "str");
		}
		
		// 상속에서도 오버라이딩은 허용된다.
		 
	
	}

public class overloading {

	public static void main(String[] args) {
		
		Calculator5 c1 = new Calculator5 (20,30,40);
		c1.sum(20);

		//SubtractCalculator c2 = new SubtractCalculator(20,30);
		//c2.sum();
	}

}
