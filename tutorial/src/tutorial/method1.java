package tutorial;

public class method1 {

	public static void numbering () {
		
		//numbering�̶�� �޼ҵ�(f(x)���� �Լ�)�ȿ� ������ §�� : public static �ڿ� ���ϴ� �̸����� �޼ҵ� ���������
		
		int i = 0; // ���� i�� int��� ������ Ÿ���� �������ְ� 0�� �־��� : �̰� '�ʱ�ȭ�Ѵ�'�� �� 
		/*
		i�� �׸������� � ���� ũ���� �׸����� �˼����� �㳪 int ��� 
		�׸��� ũ�⸦ �������ָ� �� �׸��� ���ڸ� -2����� 2����� �������ִٴ°� �˼��ִ�
		�� �ܿ� �پ��� ������ Ÿ�Ե��� ���� boolean , long, float ��� �⺻������ int ���� ��
		
		�ʱ�ȭ ���ִ� ����? �����ϰ� �ʱ�ȭ (=���� ����) ������������ ����Ҷ� �� ������ ���� ��µǱ� �����̴�
		*/
		
		while (i <= 10) { //i(0)�� 10���� �۰ų� ������ �ݺ� -> i(1)�� 10���� �۰ų� ������ �ݺ� ...
		
		/*
	     �ݺ��� while�� ()�ȿ��� ������ �ɾ��ְ� ������ '��'�̸� { } �� �����
		*/
			
			System.out.println(i); //0���� 10���� ����ϰ��� 
		
		/*
		System.out.println ������ ��Ȯ�� ���ش� javadoc�� �������� ����� ���ִ� �뵵�θ� �˰�����
		*/
			
			i++; //�̰� ������ i�� ��� 0�̰���?
			
	    /*
	     �������� ���������ڷ� ���� ���� 1�� ���������� ++i �� i++ �� �ٸ���
	    */
			
		} //�ݺ��� ��
		
	}
	
	//0���� 1���� ������ִ� numbering �Լ��� ��������� ���� ������� �ʰ���?
	
	public static void main(String[] args) { 
		// ��� �ؿ��� �Լ��� ��� ����̵� 
		// �ڹٴ� main �޼��带 ȣ���ϰ� �츮�� �ϴ°� ���� �޼����� ������ ¥�°��� 
		
		numbering(); //���� ���� ����ǥ�� �ٿ�����. ��Ģ��
		
		//�޼ҵ� ��� 0~10���� ��µ�
		
		/*
		 * ���� 0~10���� 5��,õ�� �ݺ� �ϰ� �ʹ�? numbering�� 5��,õ�� ���ָ�� ���� �����ϰ� �ʹ�? 
		 * numbering�� �޼��带 �ѹ��� ���� �ϸ��
		 * �ٵ� ���� �޼ҵ尡 ���ٸ� while���� �ټ���,õ�� ���ٻӴ��� �����Ҷ��� ���� �ϰ��� 
		 * �̷� ���� �޼ҵ��� ��Ȱ�뼺�̶�� �Ѵ� �� ������ �����ϱ� ���ϴٴ� ����
		 * 
		 * */
	}// ���� : ���� �޼����� ��. ���� 0~10�� �ƴ϶� ���ϴ� ���ں��� ���ϴ� ���ڱ��� ��� �����ϵ��� �غ���

}