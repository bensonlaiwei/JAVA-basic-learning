package tw.com.code.demo;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a==b);//false
		System.out.println(a==c);//true
		//整合上面的兩個boolean
		System.out.println(a==b & a == c);//一般的程式
		System.out.println(false & true);
		
		System.out.println(a == b && a == c); //java使用的
		System.out.println(false & true);
		
	}

}
