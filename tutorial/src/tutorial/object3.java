package tutorial;


/*
 *  클래스 멤버와 인스턴스(객체) 멤버에 대해 알아보겠음
 *  멤버 : 변수,메서드를 통칭하는것
 *  [1] 변수
 *  인스턴스 변수는 object2.java 에서 했던것 인스턴스를 생성하면서 넣어준 left와 right 의 값임
 *  클래스 변수는 모든 인스턴스에 동일한 값이 필요할때 클래스 내부에 static 붙여서 만듬
 *  클래스 변수의 용도는 
 *  1.인스턴스에 따라 변하지 않는 값이 필요한 경우
 *  2.인스턴스를 생성할 필요 없는 값을 클래스에 저장하고 싶은 경우
 *  3.값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우
 *  [2] 메소드
 *  메소드가 인스턴스 변수를 참조하지 않는다면 클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을수있다
 *  인스턴스 메소드는 클래스 메소드에 접근할 수 있다
 *  클래스 메소드(인스턴스가 생성되기 전에 만들어짐)는 인스턴스 메소드에 접근할 수 없다 
 */

class Calculator1 {
	
	int left , right ;
	
	static double PI = 3.14 ; 
	//static을 멤버 앞에 붙여주면 클래스변수가 됨 아래에 이 클래스 변수에 접근하는 방법이있음
	
	public Calculator1 (int left , int right) {
		
		this.left = left ;
		this.right = right;
		
	}
	
	public int sum () { //static 을 쓰면 안되는 이유? 생성자 때문에???
		return this.left + this.right ;
	}
	public int avg () {
		return this.left + this.right / 2 ;
	}
	
	/*
	 * [2] 메소드 예제
	 */
	
	static void static_static () {
		System.out.println(PI);
		//클래스 메소드가 클래스 변수에 접근
	}
	static void static_instance () {
		//System.out.println(left);
		//클래스 메소드가 인스턴스 변수에 접근 X
	}
	void instance_static () {
		System.out.println(PI);
		//인스턴스 메소드가 클래스 변수에 접근
	}
	void instance_instance () {
		System.out.println(left);
		//인스턴스 메소드가 인스턴스 변수에 접근
	}
	
}
public class object3 {

	public static void main(String[] args) {
		Calculator1 cal = new Calculator1 (20,30); 
		
		/*
		 *  요건 인스턴스의 멤버임 인스턴스를 만들어야 사용할 수 있으니까
		 *  이렇게 하나의 클래스를 각각다른 인스턴스 변수를 입력해 여러개의 인스턴스로 만들수도 있지만
		 *  경우에 따라 인스턴스마다 다른 값을 주는게 아닌 모든 인스턴스가 같은 값을 공유하도록 하고 싶을수있음
		 *  예를 들면 원주율같이 (PI)
		 */
		
		System.out.println(cal.PI); //인스턴스를 통해서 접근
		System.out.println(Calculator1.PI); //클래스를 통해서 접근 이방벙은 인스턴스를 생성할 필요가 X
		
		/*
		 * [2] 메소드 예제
		 */
		
		cal.static_static(); //인스턴스로 클래스(정적)메소드에 접근
		cal.static_instance(); //인스턴스로 클래스(정적)메소드에 접근
		cal.instance_static(); //인스턴스로 인스턴스 메소드에 접근
		cal.instance_instance(); //인스턴스로 인스턴스 메소드에 접근
		
		Calculator1.static_static(); //클래스로 클래스 메소드에 접근
		Calculator1.static_instance(); //클래스로 클래스 메소드에 접근
		//Calculator1.instance_static(); //클래스로 인스턴스 메소드에 접근 X
		//Calculator1.instance_instance(); //클래스로 인스턴스 메소드에 접근 X 
		
	}

}
