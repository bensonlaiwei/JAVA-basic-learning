package tw.com.lccnet.test;

import org.junit.Test;

public class Demo02 {
	
	@Test
	public void test01() {
		Demo01 d1 = new Demo01();
		try {
			d1.test02(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("不要輸入0");
		}
	}
}
