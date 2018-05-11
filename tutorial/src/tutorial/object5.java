package tutorial;

/*
 * 이번엔 상속(Inheritance) 파트다
 * 상속은 객체지향의 재활용성을 극대화 시켰지만 동시에 객체지향을 복잡하게 만들었음
 * 상속이란? 어떤 객체의 변수와 매소드를 다른 객체가 물려받는것. 
 * 왜 생겼냐? 기존의 객체에 만약 새로운 기능을 추가하고 싶음 근데 그러려면 (실전이라면) 내가 만들지않은
 * 객체의 원 소스를 수정해야함 개부담.
 * 그리고 원하는 기능의 메소드를 추가하면 다른 곳에서는 불필요한 기능들이 추가될 수 있음.
 * 그래서 그 객체의 클래스를 상속받아서 새로운 기능만 추가해줄수있게 하는것.
 */

class Calculator2 {
	
	int left , right ;
	
	public void setOprands (int left , int right) {
		
		this.left = left;
		this.right = right;
		
	}
	
	public void sum () {
		System.out.println(this.left + this.right);
	}
	public void avg () {
		System.out.println(this.left + this.right / 2);
	}
	
}

class subatractCalculator extends Calculator2 {

	public void subatract () {
		System.out.println(this.left - this.right);
	}
	
}

public class object5 {
	
	
	public static void main(String[] args) {
		
		subatractCalculator c1 = new subatractCalculator ();
		c1.setOprands(20, 10);
		c1.subatract();
		
	}

}
