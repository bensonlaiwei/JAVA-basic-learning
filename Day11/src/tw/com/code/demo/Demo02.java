package tw.com.code.demo;


/*
 * 類別(內外)
 * 外部 public default                   final       
 * 內部 public default private protected final static
 * 
 * 
 */

//外部類別
public class Demo02 {
	//建立內部類別實體
	private InnerClass in = new InnerClass();
	//使用實體進行呼叫方法
	public void getmothod() {
		int u = in.getCount();
		System.out.println(u);
	}
	
	public Demo02() {
		System.out.println("外部建構子=========");
	}
	
	//內部類別，通常是私有的，因為建立類別主要是隱藏內部的運算、計算，或預防被調用
	//一定會私有化，外部無法使用，配合方法傳出
	public class InnerClass{
		
		int a = 100;
		int b = 200;
		
		//內部類別的方法
		public int getCount() {
			return a+b;
		}
	}
}
