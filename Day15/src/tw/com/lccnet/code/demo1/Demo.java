package tw.com.lccnet.code.demo1;

import org.junit.Test;

public class Demo {
	
	
	@Test
	public void test02() {
		g3(new Demo01());
		g3(new Demo02());
		g3(new Demo03());//沒有繼承，無法使用
		
	}
	//AllDemo all = new Demo01() //多型或是多態的概念
	public void g3(AllDemo all) {
		if (all instanceof Demo02) {
			all.lmethod();
		}
		else if (all instanceof Demo01) {
			all.lmethod();
		}
		else if (all instanceof Demo03) {
			all.lmethod();
		}
		
	}
	
	
	
	public void test01() {
		g1(new Demo01());
		g1(new Demo02());
		
		
	}
	
	public void g1(Demo01 d1) {
		
	}
	
	
	public void g1(Demo02 d2) {
		
	}

}
