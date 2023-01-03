package tw.com.lccnet.code.demo3;

import org.junit.Test;

public class Demo01 {
	
	@Test
	public void test01() {
		//RuntimeException，要運行時才會有錯
		int a=10/0;//java.lang.ArithmeticException數學錯誤
		System.out.println(a);
		//exception
		System.out.println();
		
	}
}
