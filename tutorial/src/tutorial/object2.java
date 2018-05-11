package tutorial;

/*
 * 'Ŭ����'�� �������
 * sum �� avg �� ����� '�Ի�'���Ѵٴ� ������ ����� ����� ������ ����
 * �׷��� �̰͵��� �����ְ� ���� Calculator (����) ��� �̸��� �ٿ��� Ŭ������ ��������
 */
class Calculator {
	
	//'������' ������� : ��ü�� ������ �� ȣ��� 
	// �� ������ֳ�? ��ü������ �ʱ�ȭ�� �ش��Ѵ�
	int left , right;
	
	public Calculator(int left, int right) { 
	//�ν��Ͻ�(��ü) �����Ҷ� left,right ���� �� �Է��ϵ��� ����
		this.left = left;
		this.right = right;
	/*
	 * [�̰� object4 �������� ����]
	 * this �� �޼ҵ� ���ο��� �ν��Ͻ� ������ ������ �� �ֵ��� ���ִ� ����
	 * ���� �̸��� ������ �޼ҵ� ���ο����� ���������� �켱�̶� this �� �ν��Ͻ� ����(��������)�� �������°���
	 */
	}
	/*
	 * ������ Ư¡��
	 * ��ü ���� �������� left �� right�� ���� �����ϴ� ������ ���� �Ҽ��ִ�. -> main �޼��� �Ʒ� ����
	 * ��ȯ���� ���� -> return �� ����? �����ڴ� �ν��Ͻ�(��ü)�� �������ִ� Ư���� �޼ҵ�� �׷�
	 * �������� �̸��� Ŭ������ �����ϰ� ������ش�.
	 */
	
	public void sum () {
		System.out.println(this.left + this.right);
	}//���ϱ�
	public void avg () {
		System.out.println(this.left + this.right / 2 );
	}//���
	
	
	//�����ڴ� ������ ������ټ��� ���� middle �̶� �Ű������� �߰��ؼ� �ʱ�ȭ ������
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
		
		//�ν��Ͻ�(��ü) ���� ����� new Calculator()�� ��ü�� ������� �̷��� ������� Calculator �� '�ν��Ͻ�' �����
		Calculator cal = new Calculator(20,30); 
		/*
		 * �̷��� �ν��Ͻ��� �����Ҷ� left �� right ���� �Է��ϵ��� ������ (�������� Ư¡)
		 * �̷��� ���� �ϸ� ������������ ������ ���ϼ��ְ���? ���� �������� ������ 
		 * ���ڸ� �ȳְų� �ƴ� �� �ְų� �ϴ� �߸��� ���� �Է��� ��Ȳ���� ������ �˾������� ����
		 * 
		 * cal �̶�� ���� �����Ҷ� ������ Ÿ���� ���� Calculator ��? 
		 * ���� ���� Ŭ������ ������ Ÿ��(����� ���� ������ Ÿ���̶����)�̵�
		 * ������ new Calculator �� �ν��Ͻ�(��ü)�� ������ذ���
		 * 
		 */
		cal.sum();
		cal.avg();
		
		
		Calculator cal1 = new Calculator(20,30,40);
		cal1.sum1();
		cal1.avg1();
	}

}
