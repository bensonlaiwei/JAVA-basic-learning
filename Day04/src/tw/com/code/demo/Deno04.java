package tw.com.code.demo;

public class Deno04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15 ;
		System.out.println(a<<1);
		System.out.println(a>>1);
		/*
		 *     0 0 0 0 1 1 1 1 = 15
		 *   0 0 0 0 1 1 1 1 0 = 30
		 *   ----------------------------------
		 *     0 0 0 0 1 1 1 1 = 15
		 *       0 0 1 1 1 1 1 1 = 7
		 */
		
		int a1 = 10;
		a1 = a1<<=2;
		

	}

}
