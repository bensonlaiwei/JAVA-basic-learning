package tw.com.code.demo;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一種方式
		int a = 10;
		int b = 20;
		int temp;
		temp = a ;
		a = b ;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		//第二種方式
		int a1 = 52;
		int b1 = 15;
		a1 = a1^b1; // a1 = 59 
		b1 = a1^b1; // b1 = 52
		a1 = a1^b1; // a1 = 15
		
		
		System.out.println(a1);
		System.out.println(b1);
	}

}
