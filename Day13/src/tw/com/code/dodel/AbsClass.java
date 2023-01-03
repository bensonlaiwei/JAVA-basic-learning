package tw.com.code.dodel;


/*
 * 抽象類別、抽象方法
 * 
 * 抽象類別
 * 抽象類別可以放置一般方法跟抽象方法
 * 內部結構跟一般類別一樣
 * 但抽象類別，不能建立實體
 * 
 * 
 * 抽象方法
 * 1. 有方法頭，無方法體
 * 2. 加上抽象關鍵字 abstract
 * 3. 抽象發法只能放在抽象類別或介面中，在類別的Class錢加上抽象關鍵子
 * 
 * 
 * 
 * 用途 : 常放置於繼承結構的第二層或第三層
 * 需要實作抽象方法(進行複寫抽象方法)
 * 
 */


public abstract class AbsClass {

	public void method01() {
		
	}
	//抽象方法
	public abstract void methodAbs();
	
	public abstract void methodAbs1();
	
	
}
