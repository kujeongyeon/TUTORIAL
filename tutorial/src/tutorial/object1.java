package tutorial;

public class object1 {

	//��ü������ �ƴ� �ڵ带 ���� ����
	
	public static void sum (int left, int right) {
		System.out.println(left+right);
	}//�̰� ���ϱ� �żҵ�
	
	public static void avg (int left, int right) {
		System.out.println(left+right/2);
	}//�̰� ��ձ��ϴ� �޼ҵ�
	
	public static void main(String[] args) {
		
		int left = 10;
		int right = 20;
		
		sum (left,right);
		avg (left,right);
		
		left = 30;
		right = 40;
		
		sum (left,right);
		avg (left,right);
		
		/*
		 * �� ���� ��
		 * - left �� right �� ���� �ٲ���� ���� �ڵ带 �ݺ�������Ѵ�. 
		 * - �ڵ尡 ���������� �޼ҵ� sum �� avg�� ������ �ٸ��ǵ��� ����Ѵٸ�? 
		 * sum �� summary(���)���� �˰� �߸����ų� ���� left , right �� �ǹ̸� �ٸ� �ǹ̷� ���ٸ� ���װ� ������̴�.
		 * 
		 * �׷��� ������ �̰͵��� '��ü����'������ ������ִ°���
		 * ������ ������ �޼ҵ带 Ŭ�����ȿ� �־� �ϳ��� �׷����������.
		 * ��ü������ ������ �����ϱ� ��Ȱ�ڵ� �����ϰų� �����
		 */
		
		
	}

}
