package array;

public class TestArray {
	public static void main(String[] args) {
	
	int []a = new int[3];
	a[0]=12;
	a[1]=13;
	a[2]=16;
	
	
	Car cars[] =new Car[2];
	cars[0]=new Car("����");
	cars[1]= new Car("����");
	System.out.println(cars.length);//length ����
	
	for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i].name);//�����������
	}
	}
}