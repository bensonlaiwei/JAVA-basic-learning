package tw.com.code.demo;

import org.junit.Test;

public class Demo05 {
	
	public void test02() {
		//呼叫空參數建構值
		Person ps = new Person();
	}
	
	
	@Test
	public void test01() {
		Person ps = new Person(1, "TIM", "Taipei","123@ijgieog");
	}
}
