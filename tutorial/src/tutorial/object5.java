package tutorial;

/*
 * �̹��� ���(Inheritance) ��Ʈ��
 * ����� ��ü������ ��Ȱ�뼺�� �ش�ȭ �������� ���ÿ� ��ü������ �����ϰ� �������
 * ����̶�? � ��ü�� ������ �żҵ带 �ٸ� ��ü�� �����޴°�. 
 * �� �����? ������ ��ü�� ���� ���ο� ����� �߰��ϰ� ���� �ٵ� �׷����� (�����̶��) ���� ����������
 * ��ü�� �� �ҽ��� �����ؾ��� ���δ�.
 * �׸��� ���ϴ� ����� �޼ҵ带 �߰��ϸ� �ٸ� �������� ���ʿ��� ��ɵ��� �߰��� �� ����.
 * �׷��� �� ��ü�� Ŭ������ ��ӹ޾Ƽ� ���ο� ��ɸ� �߰����ټ��ְ� �ϴ°�.
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
