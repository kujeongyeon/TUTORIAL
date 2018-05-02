package tutorial;


/*
 *  Ŭ���� ����� �ν��Ͻ�(��ü) ����� ���� �˾ƺ�����
 *  ��� : ����,�޼��带 ��Ī�ϴ°�
 *  [1] ����
 *  �ν��Ͻ� ������ object2.java ���� �ߴ��� �ν��Ͻ��� �����ϸ鼭 �־��� left�� right �� ����
 *  Ŭ���� ������ ��� �ν��Ͻ��� ������ ���� �ʿ��Ҷ� Ŭ���� ���ο� static �ٿ��� ����
 *  Ŭ���� ������ �뵵�� 
 *  1.�ν��Ͻ��� ���� ������ �ʴ� ���� �ʿ��� ���
 *  2.�ν��Ͻ��� ������ �ʿ� ���� ���� Ŭ������ �����ϰ� ���� ���
 *  3.���� ���� ������ ��� �ν��Ͻ��� �����ؾ� �ϴ� ���
 *  [2] �޼ҵ�
 *  
 */

class Calculator1 {
	
	int left , right ;
	
	static double PI = 3.14 ; 
	//static�� ��� �տ� �ٿ��ָ� Ŭ���������� �� �Ʒ��� �� Ŭ���� ������ �����ϴ� ���������
	
	public Calculator1 (int left , int right) {
		
		this.left = left ;
		this.right = right;
		
	}
	
	public int sum () { //static �� ���� �ȵǴ� ����? ������ ������???
		return this.left + this.right ;
	}
	public int avg () {
		return this.left + this.right / 2 ;
	}
	
}
public class object3 {

	public static void main(String[] args) {
		Calculator1 cal = new Calculator1 (20,30); 
		/*
		 *  ��� �ν��Ͻ��� ����� �ν��Ͻ��� ������ ����� �� �����ϱ�
		 *  �̷��� �ϳ��� Ŭ������ �����ٸ� �ν��Ͻ� ������ �Է��� �������� �ν��Ͻ��� ������� ������
		 *  ��쿡 ���� �ν��Ͻ����� �ٸ� ���� �ִ°� �ƴ� ��� �ν��Ͻ��� ���� ���� �����ϵ��� �ϰ� ����������
		 *  ���� ��� ���������� (PI)
		 */
		
		System.out.println(cal.PI); //�ν��Ͻ��� ���ؼ� ����
		System.out.println(Calculator1.PI); //Ŭ������ ���ؼ� ���� �̹溡�� �ν��Ͻ��� ������ �ʿ䰡 X
	}

}
