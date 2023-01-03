package tw.com.code.demo;

import org.junit.Test;

public class Demo02 {
	@Test
	public void test1() {
		//建立實體(建構實體只要在heap建立關聯記憶體)，建立實體就會進行建構子
		Demo01 d1 = new Demo01(10);//
		d1.method(20);
	}
}
