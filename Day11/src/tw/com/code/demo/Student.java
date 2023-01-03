package tw.com.code.demo;

/*
 * 方法繼承
 * 1.不同class，方法名稱相同，內容也相同
 * 開啟一個新的class作為父類别，將同名方法進行抽離 
 */


public class Student extends Person {
//	繼承，可以直接使用父類別的方法
	
	public void read() {
		System.out.println("read");
	}
	
	
	
}
