package tw.com.code.demo;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; // 32
		float b = 10; //32
		
		a = (int)b ;//float指定給了int會少了小數點
		b = a ;
		System.out.println(b);
		System.out.println(a);
		long z = 10 ;
		double y = 10 ;
//		z = y; // double指定給long 會少小數點的值
		y = z;
		System.out.println(z);
		System.out.println(y);

	}

}
