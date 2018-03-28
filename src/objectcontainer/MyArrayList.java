package objectcontainer;
/**
 * 模拟实现JDK中提供的Arraylist（容器）
 * @author Administrator
 *
 */
public class MyArrayList {
	private Object value[];
   private	int size;
	public MyArrayList () {
	// value =new Object [16];
	this(16);//调用另一个构造器
	}
	public MyArrayList (int size) {
		 value= new Object[size];
		 
		}
	public void set( Object dongxi) {
		
		
		if(size>=value.length) {
			kuorong();
			/*int newCapacity =value.length*2;
			
			Object newList []= new Object[newCapacity];
			for(int i=0;i<size;i++) {
				newList [i]=value[i];
				System.out.println(newList[0]);
			}
			System.out.println(newList[0]);
			value=newList;*/
		}
		
		value[size]=dongxi;
		size++;
		System.out.println(size);
		
	}
	public  Object get(int index) {
		if(index<0||index>size-1) {
			try {
				throw new Exception();
			} catch (Exception e) {//s手动抛出异常，以后再说
				
				e.printStackTrace();
			}
		}
		return value[index];
	}
	
	public static void main(String[] args) {
		//怎么声明那？
		MyArrayList a =new MyArrayList(2);
		
		a.set("ccc");
	
		a.set(new Human("陈曦"));
		a.set("dss");
		//System.out.println(a.get(0));
		//String b=(Human)a.get(1);
		Human h= (Human)(a.get(1));
		System.out.println(h.getName());
	}
	
	public  void kuorong() {
		int newCapacity =value.length*2;
		
		Object newList []= new Object[newCapacity];
		for(int i=0;i<size;i++) {
			newList [i]=value[i];
			System.out.println(newList[0]);
		}
		System.out.println(newList[0]);
		value=newList;
		
	}
	
}
