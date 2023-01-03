package tw.com.code.demo;

import org.junit.Test;

public class Demo01 {

	public Demo01() {
		
	}
	@Test
	public void test01() {
		Utils us1 = new Utils();
		Utils us2 = new Utils();
		Utils us3 = new Utils();
	}
	
	@Test
	public void test02() {
		Demo02 d2 = new Demo02();
//		Demo02.InnerClass dd2 = new Demo02().new InnerClass();
		d2.getmothod();
	}
}
