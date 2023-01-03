package tw.com.code.demo;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println("-----------------and----------------------");
		System.out.println(a<b && a==c);
		System.out.println(a<=b && a==c);
		System.out.println(b>=a && a!=c);
		System.out.println(b>=a && a==c);
		System.out.println(b>a && a<c);
		System.out.println("-----------------or----------------------");
		System.out.println(a<b || a==c);
		System.out.println(a<=b || a==c);
		System.out.println(b>=a || a!=c);
		System.out.println(b>=a || a==c);
		System.out.println(b>a || a<c);
	}

}
