package tw.com.code.demo;

import org.junit.Test;



public class Demo02 {

	//屬性
	private Integer a ; //參考，不須初始化，放置於方法外，class內(軟體式的記憶體使用)
	private int b; 
	private Demo02 d2; //自定義型態
	
	@Test
	public void method()
	{//變數 atutoboxing
		int a=10;//基本、初始化、放置方法內(硬體式的記憶體使用)
		Integer b = 20 ;//自動封裝(自動將int轉成Integer)
		Integer c= 30;
		
		System.out.println(c.toString()+b);
	}
}
