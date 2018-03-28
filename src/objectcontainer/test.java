package objectcontainer;

public class test {
	Object aaa[];
	int size;
	Object bbb[]= new Object[5];
	Object ccc[]=new Object[10];
	public test(int a) {
	
	aaa =new Object[a];
	}
	
public void set( Object dongxi) {
		
		aaa[size]=dongxi;
		size++;
		ccc[0]="111";
		ccc[1]="111";
		ccc[2]="111";
		ccc[3]="111";
		bbb=ccc;
		
	}
public Object get(int a){
	
	return bbb[a] ;
}
	
	public static void main(String[] args) {
		test a=new test(5);
		test b=new test(10);
		a.set("666");
		System.out.println(a.get(0));
		
	}
}
