package tutorial;

import java.io.*;

public class method3 {

	public static String numbering (int init, int limit) {
		
		int i = init;
		String output = ""; //���ڸ� ��� ���� �� ���� �־��ش�.
		
		/*
		 * String�� int���� ������ Ÿ����
		 * ���ڰ� �ƴ� ���ڸ� ��� �׸��̶�� �����ϸ�ȴ�. 
		 */
		
		while( i < limit ) {
			
			output += i; //���ڸ� ȭ�鿡 ����ϴ� ��� ���� output �� ���� 
			
			i++;
			
		}
		
		return output; //return ���� output �� ��� 
		
		/*
		 *  return �� ���ؼ� ��ȯ�� ���� ������������ public static �ڿ� �� ���־���Ѵ�. ��Ģ��
		 *  �̷��� �����ν� �������ִ� ������ �޼ҵ常 ���� � ������ ��µ��� �˼��ִٴ���
		 *  String�� �տ� �پ������� ���ڰ� ��µǰڱ�. int�� �پ������� ���ڰ� �پ��ְڱ�!
		 *  
		 *  return �� ��Ȱ 
		 *  1. ���� ��ȯ�Ѵ� 
		 *  2. �޼ҵ带 �ߴ� ��Ŵ = ������ ������ ������ ������ ������� X 
		 */
	}
	
	public static void main(String[] args) {
		
		String result = numbering(3,9); //�޼ҵ� numbering �� ���� result�� ���
		
		System.out.println(result);

		/*
		 * ���� �̷������� return ���� ��� �ϴ� ����?
		 * ��ǰ���ν��� ��ġ�� ���̱� ���ؼ��� ���� ����� �ƴ϶� ���Ͽ� ����ϰ� �ʹٸ�?
		 * �޼ҵ带 ��ɿ� �°� ���� ������ټ��� �ְ����� ��°� ��� ������ ���� ������ �и����ִ°��� ����
		 * 
		 */
		
		try { //����ó����� �ϴµ� �ϴ� �����ϼ�
			
			//out.txt ��� ���Ͽ� result �� ��ȯ�� ���� ������ (ȭ�鿡 ����ϴ°��� �ƴ� ó������� ��ȯ��)
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
			//���� �̰��� �����Ϸ����� ���� �׳� out.txt��� �ؽ�Ʈ ������ ������ִ±��� ����
		}catch(IOException e) {
			
		}
		
		//�����Ű�� tutorial �� f5�� ������ ���ΰ�ħ�ϸ� out.txt������ �������
		
		//���� : �ϳ��� �޼ҵ�� return���� �ϳ��� ������ ��ȯ�� �� �ִ�. �������� ��ȯ �� ���� ������? 
	}

}
