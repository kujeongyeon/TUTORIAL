package tutorial;

/*
 * overloading (�����ε�)
 * ���� �̸��� �޼ҵ带 �ߺ��� �����ϸ鼭 �Ű������� ������ ������ �ٸ������ϴ� ���
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
	 * �����ε��� �Ű������� �޶����� �̸��� ���Ƽ� ���� �ٸ� �޼ҵ尡 �ȴ�.
	 * 
	 * �����ε��� ��Ģ
	 * 1.����Ÿ���� ���ƾ� �Ѵ�
	 */
	
	public void sum () {
		System.out.println(this.left + this.right);
	}
	
	//public int sum () {
	//	return (this.left + this.right + this.middle);
	//}
	// ����Ÿ���� �޶� �ȵ�
	
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
		
		// ��ӿ����� �������̵��� ���ȴ�.
		 
	
	}

public class overloading {

	public static void main(String[] args) {
		
		Calculator5 c1 = new Calculator5 (20,30,40);
		c1.sum(20);

		//SubtractCalculator c2 = new SubtractCalculator(20,30);
		//c2.sum();
	}

}
