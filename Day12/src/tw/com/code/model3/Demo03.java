package tw.com.code.model3;

import org.junit.Test;

import tw.com.code.model2.Demo01;



//不同套件，不同類別
public class Demo03 {
	@Test
	public void method01() {
		Demo01 d1 = new Demo01();
		System.out.println(d1.note);
	}

}
