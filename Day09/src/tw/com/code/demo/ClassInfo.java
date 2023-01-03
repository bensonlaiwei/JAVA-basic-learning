package tw.com.code.demo;


//class內部基礎結構
public class ClassInfo {
	//屬性
	private Integer a;
	
	//建構子
	public ClassInfo() {
	
	}
	//方法
	public static void stMethod()
	{
		int a = 10;//變數
	}
	public void method()
	{
		int a = 30;//變數
	}
	
	//內部類別
	class InterClass{
		
	}
	//匿名類別
	ClassInfo f = new ClassInfo();
	
	//enum
	enum color{
		
	}
	
	
}