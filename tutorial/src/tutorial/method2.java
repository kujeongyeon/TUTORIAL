package tutorial;

public class method2 {

	//�Է°��� �ָ� �Է��� ���ϴ� ���ں��� ����� ���ϴ� ���ڱ��� ���� �� ���ְ���?
	
	public static void numbering(int init, int limit) { //�Է°�(�Ű�����)�� 2�� �޾ƿ�
		/*
		 * �Է°��� �޾ƿ� = �Ű������� ���� ��
		 */
		int i = init; // 3�̶�� �Ű������� i �ȿ� ������
		
		while( i < limit ) { // 9��� �Ű������� ���⼭ ���̰���
			
			System.out.println(i);
			
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		numbering(3,9);
		//���⼭ �Է°��� �� �޼ҵ带 ȣ���Ҷ� ���޵Ǵ� ���� ���ڶ�� �� ���������δ� �Ű������� ���ڸ� ���������ʰ� �θ�
		
		//���� : �� �׷� ���� �ٸ� ������� ����ϴ� ���� �˾ƺ���.
	}

}
