package string;
//测试可变字符序列。 常用 StringBuilder（线程不安全，效率高）
//StringBuffer(线程安全，效率低)
//string不可变字符 
public class StringBulider {
	public static void main(String[] args) {
		StringBuilder b =new StringBuilder();//字符数组长度为16
		StringBuilder b1 =new StringBuilder(32);//字符数组长度为32
		StringBuilder b2 =new StringBuilder("abcd");//value[]字符数组长度16+4，数组为a,b,c,d,\n000,...
		b2.append("efg");
		b2.append(true).append(321).append("随便");//通过return this 实现方法链
		System.out.println(b2);
		b2.delete(0, 2);
		System.out.println(b2);
	}

}
