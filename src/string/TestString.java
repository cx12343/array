package string;

public class TestString {
public static void main(String[] args) {
	String str ="abcd";
	String str2 =new String("abcd");
	char[] str3 ={'a','b'};
	System.out.println(str.charAt(2));//在某位对应的字符，这里是c
	System.out.println(str.equals(str2));//内容和地址比较  值是true
	System.out.println(str==str2);//str指的是对象的地址  str2指的是堆里面的常量池
	
	String str4="abcd";
	String str5="abcd";
	System.out.println(str4==str5);//结果是true
	
	System.out.println(str.indexOf('c'));//结果为2，第三位， 返回摸个字符在某位 与charAt相反
	System.out.println(str2.indexOf('f'));//结果为-1 超出范围
	System.out.println(str.lastIndexOf('c'));//indexOf是正方向，lastindexof是反方向

	System.out.println(str2.substring(2));//结果为cd 从字符串的第几位开始取
	
	System.out.println(str2.replace('a', 'b'));//结果bbca  把b换成a
	String str6= "aaa,bbb,ccc,";
	String [] aa = str6.split(",");//把str6按“，”切割，返回一个数组
	for (int i=0;i<aa.length;i++) {
		System.out.println(aa[i]);//分别打印数组，结果aaa   bbb  ccc
	}
	String str7= "  aaa  bb  ";
	System.out.println(str7.trim());//去掉首位空格  结果aaa bb
		String str08= "i am string";
		char a[] = str08.toCharArray();//把每一个字符变成数组的一个数，输出的是一个数组
		for(int j=0;j<str08.length();j++) {
			System.out.print(a[j]);
			
		}
		System.out.println("ABC".equalsIgnoreCase("abc"));//比较两个字符串忽略大小写  结果ture
		System.out.println("ABC".startsWith("AB"));//是否以xx为开头 结果true
		System.out.println("ABC".endsWith("BC"));//是否以xx为结尾  结果true
		System.out.println("ABC".toLowerCase());//转小写
		System.out.println("abc".toUpperCase());//转为大写
		
		String gh ="a";
		for (int z=0;z<10;z++) {
			gh +=z;
		}
		System.out.println(gh);//结果：a0123456789
		//本来String是final修饰，这里建立了11个对象，指针变了

		StringBuilder gh1 =new StringBuilder();//容量16
		for (int z=0;z<100;z++) {
			gh1.append(z);//自动建立新的大容量替换原来的小容量
		}
		System.out.println(gh1);
}
}
