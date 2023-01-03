package tw.com.lccnet.demo4;


/*
 * 中文叫做 介面 interface
 * 			1.常數
 * 			2.抽象方法
 * 			3.不走繼承
 * 
 * 			4. 如有多個抽象方法，不能建立實體，只有一個的話可以建立，但必須加上註解 @FunctionInterface
 * 			
 * 
 */

public interface Info01 {
	//1.常數
	public static final double PI = 3.1415912;
	
	//會自動加上static 跟 final(內部會)
	public double PPI=3.14159152;
	
	
	
//	public void method() {} 不能用一般方法
	
	
	//抽象方法
	public abstract void getMethod01();
	
	//會自動加上abstract(內部會)
	public void getMethod02();
	
	
	
}
