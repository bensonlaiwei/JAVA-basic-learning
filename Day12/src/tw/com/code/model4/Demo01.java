package tw.com.code.model4;


/*
 * 同package，不同class
 */

public class Demo01 extends Bean {
	
	public void method() {
		Bean b1 = new Bean();
		
//		System.out.println(b1.id);//private
		System.out.println(b1.name);//protected
		System.out.println(b1.email);//Default
		System.out.println(b1.age);//public
	}

}
