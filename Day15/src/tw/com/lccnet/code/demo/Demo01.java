package tw.com.lccnet.code.demo;

import org.junit.Test;

/*
 * 
 * 多型(多態)
 */



public class Demo01 {
	
	
	@Test
	public void test01() {
		getNu(new Demo02());//匿名類別
	}
	
	
	
	
	
	public void getNu(Demo02 d2) {
		d2.method01();
		d2.method03();
	}
	
	
	
	
	
//	@Test
	public void method03() {
		
		//1-3
		InfoDemo01 i1 = new Demo02();
		i1.asbMethod01();
		
		//2-3
		AbsDemo01 a1 = new Demo02();
		a1.asbMethod01();//interface
		a1.method03();//abstract
		
		//3-3
		Demo02 d2 = new Demo02();
		d2.asbMethod01();
		d2.method01();
		d2.method03();
		
		
	}
	
	
	
	
	
	
	
	
	
	
//	@Test
	public void method2() {
		//繼承抽象，要複寫抽象方法內容@Override
		Demo02 d2 = new Demo02();
		d2.method01();
		d2.method03();
		
		/*
		 * 多型(多態)
		 * 前父後子(繼承或實作都可)
		 * AbsDemo01 a1 = new Demo02();
		 * 會將Demo02的層級提高到跟AbsDemo01一樣，因此只能讀取父類別方法
		 */
		AbsDemo01 a1 = new Demo02();//抽象不能建立實體，但如果後面是子類別就可以
		a1.method03();//向上轉型
		
		Demo02 d21 =(Demo02)a1;
		d21.method01();
		
		
	}
	
	
	
	
	
//	@Test
	public void method01() {
		//未繼承之前(抽象)
		Demo02 d2 = new Demo02();
		d2.method01();
		
	}
}
