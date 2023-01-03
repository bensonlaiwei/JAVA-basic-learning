package tw.com.code.demo;



/*
 * 
 * Class的運行
 */

public class Demo03 {
	
	//建構值
	public Demo03()
	{
		System.out.println("建構子");
	}
	//代碼塊
	{
		System.out.println("代碼塊");
	}
	//static代碼塊，建立實體只會運行一次，實體開發會用
	static {
		System.out.println("static代碼塊");
	}

}
