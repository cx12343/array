package string;
//���Կɱ��ַ����С� ���� StringBuilder���̲߳���ȫ��Ч�ʸߣ�
//StringBuffer(�̰߳�ȫ��Ч�ʵ�)
//string���ɱ��ַ� 
public class StringBulider {
	public static void main(String[] args) {
		StringBuilder b =new StringBuilder();//�ַ����鳤��Ϊ16
		StringBuilder b1 =new StringBuilder(32);//�ַ����鳤��Ϊ32
		StringBuilder b2 =new StringBuilder("abcd");//value[]�ַ����鳤��16+4������Ϊa,b,c,d,\n000,...
		b2.append("efg");
		b2.append(true).append(321).append("���");//ͨ��return this ʵ�ַ�����
		System.out.println(b2);
		b2.delete(0, 2);
		System.out.println(b2);
	}

}
