package tw.com.code.dodel;

import org.junit.Test;





public class Demo01 {
	
	@Test
	public void test01() {
		
		@SuppressWarnings("unused")
		AbsClass ma = new AbsClass() {
			
			@Override
			public void methodAbs1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				
			}
		};
			//要求實作抽象方法
	}
	
	@Test
	public void test02() {
		SuClass ss = new SuClass();
		ss.eat(); //子類別內容
		ss.sleep();//父類別內容，子類別可以呼叫父類別方法，列印父類別的內容
		
	}
	
	
	
	
	
	
	
}
