package string;

public class TestString {
public static void main(String[] args) {
	String str ="abcd";
	String str2 =new String("abcd");
	char[] str3 ={'a','b'};
	System.out.println(str.charAt(2));//��ĳλ��Ӧ���ַ���������c
	System.out.println(str.equals(str2));//���ݺ͵�ַ�Ƚ�  ֵ��true
	System.out.println(str==str2);//strָ���Ƕ���ĵ�ַ  str2ָ���Ƕ�����ĳ�����
	
	String str4="abcd";
	String str5="abcd";
	System.out.println(str4==str5);//�����true
	
	System.out.println(str.indexOf('c'));//���Ϊ2������λ�� ���������ַ���ĳλ ��charAt�෴
	System.out.println(str2.indexOf('f'));//���Ϊ-1 ������Χ
	System.out.println(str.lastIndexOf('c'));//indexOf��������lastindexof�Ƿ�����

	System.out.println(str2.substring(2));//���Ϊcd ���ַ����ĵڼ�λ��ʼȡ
	
	System.out.println(str2.replace('a', 'b'));//���bbca  ��b����a
	String str6= "aaa,bbb,ccc,";
	String [] aa = str6.split(",");//��str6���������и����һ������
	for (int i=0;i<aa.length;i++) {
		System.out.println(aa[i]);//�ֱ��ӡ���飬���aaa   bbb  ccc
	}
	String str7= "  aaa  bb  ";
	System.out.println(str7.trim());//ȥ����λ�ո�  ���aaa bb
		String str08= "i am string";
		char a[] = str08.toCharArray();//��ÿһ���ַ���������һ�������������һ������
		for(int j=0;j<str08.length();j++) {
			System.out.print(a[j]);
			
		}
		System.out.println("ABC".equalsIgnoreCase("abc"));//�Ƚ������ַ������Դ�Сд  ���ture
		System.out.println("ABC".startsWith("AB"));//�Ƿ���xxΪ��ͷ ���true
		System.out.println("ABC".endsWith("BC"));//�Ƿ���xxΪ��β  ���true
		System.out.println("ABC".toLowerCase());//תСд
		System.out.println("abc".toUpperCase());//תΪ��д
		
		String gh ="a";
		for (int z=0;z<10;z++) {
			gh +=z;
		}
		System.out.println(gh);//�����a0123456789
		//����String��final���Σ����ｨ����11������ָ�����

		StringBuilder gh1 =new StringBuilder();//����16
		for (int z=0;z<100;z++) {
			gh1.append(z);//�Զ������µĴ������滻ԭ����С����
		}
		System.out.println(gh1);
}
}
