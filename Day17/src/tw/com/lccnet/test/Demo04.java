package tw.com.lccnet.test;

/*
 * 父類別可以包含所有子類別
 */

public class Demo04 extends Demo03{

	public void test01() {
		Demo03 d3 = new Demo03();
		try {
			d3.test01();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			d3.test02();
		} catch (ArithmeticException e1) {
			// TODO Auto-generated catch block
			//子
			e1.printStackTrace();
		}
		catch (RuntimeException e1) {
			//子
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (Exception e1) {
			// TODO Auto-generated catch block
			//父
			e1.printStackTrace();
		}
		
		
		try {
			d3.test03();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
