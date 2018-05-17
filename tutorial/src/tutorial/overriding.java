package tutorial;

/*
 * overriding (�������̵�) 
 * ����Ŭ����(�ڽ�Ŭ����) �� ����Ŭ������ �޼ҵ带 �� ��� �״�� ����� �ʿ䰡 ����. 
 * overriding �� ����ϸ� ����Ŭ������ �޼ҵ� ����� �����Ҽ��ִ�.
 * 
 * = ����Ŭ������ �޼ҵ带 �������ؼ� ����ϴ� ���
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
		System.out.println("�������� " + sum + " �̴�.");
		
		/*
		 * ���� Ŭ�������� ���� Ŭ������ ������ �޼ҵ带 �����ϸ� 
		 * �θ� Ŭ�����κ��� ���� ���� �⺻ ���� ����� �����ϴ� ȿ���� ���� �ȴ�. 
		 * �⺻������ ���а� ����ǰ�, �������� ������ �� ���� �켱������ �����ϰ� �ִ�.
		 */
	}
	
	/*
	 *  overriding �� ����
	 *  1. �޼ҵ��� ���� ������ ���ƾ� �Ѵ�. �θ�� avg �� void �ε� �ڽ��� int �� �����Ҽ�����.
	 *  2. �޼ҵ� �̸��� ���ƾ� �Ѵ�. 
	 *  3. �޼ҵ��� �Ű������� ���ڿ� ������ Ÿ�� �׸��� ������ ���ƾ���
	 *  => �� ������ ��Ʋ�� �޼ҵ��� �����̶�� �Ѵ�.
	 */


	 public int avg () {
		return (this.left + this.right)/2 ;
	} 
	 
	  // ���� Ÿ���� �޶� �ȵ�
	  
	
	public int avg2 () {
		return super.avg2();		
	}
	
	 // ������ �ߺ����� �������� super �� ���ָ�� 
}

public class overriding {

	public static void main(String[] args) {
		
		SubtractCalculator c1 = new SubtractCalculator (20 ,30); 
		c1.sum();
		
	}

}
