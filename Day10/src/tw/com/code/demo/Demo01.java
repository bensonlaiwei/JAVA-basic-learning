package tw.com.code.demo;

/**
 * 物件導向 
 * @author pas90
 *  //建構子
 *  1.名稱與class一樣包含大寫
 *  2.無回傳位置
 *  3.必須要公開
 *  4.結構跟方法類似
 *  5.class最早運行(?)，只要建立就會有一個隱藏建構值
 *  6.只要有建立就會有一個隱藏建構子
 *  7.建構值與方法都可以有傳入值
 *  8.
 */
public class Demo01 {
	
	//建構子，只要建立這個class
	public Demo01(int a) {
		
		System.out.println("*-*--建構子");
	}
	public void method(int y)
	{
		System.out.println("-----------方法-----------");
	}
	

}
