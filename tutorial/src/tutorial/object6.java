package tutorial;

/*
 * �����ڿ� ���
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
	 * �����ڰ� ���Ե� Ŭ������ ��ӹ����� �����ڵ� ���� �����������
	 */
	int middle ;
	
	public subtractCalculator2(int left, int right , int middle) {
		
		super(left, right);		
		//super�� ����Ŭ������ ����Ű�� Ű������ �θ� ������� �����ڸ� �����ϰ� ���� ���� 
		//���ο� �����ڸ� �����Ϸ��� �� �ؿ� �����ڸ� ������ �־���� 
		this.middle = middle;
	}
	/*
	 * ���� Ŭ������ ȣ��� �� �ڵ����� ���� Ŭ������ �⺻ �����ڸ� ȣ���ϰ� �ȴ�. 
	 * �׷��� ���� Ŭ������ �Ű������� �ִ� �����ڰ� �ִٸ� �ڹٴ� �ڵ����� ���� Ŭ������ 
	 * �⺻ �����ڸ� ��������� �ʴ´�.
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
