package tw.com.lccnet.test;

import org.junit.Test;


/*
 * 運行才會產生錯誤使用(自動抓取異常)
 * RuntimeException下的子類別，需要使用抓的方式
 * ArithmeticException
 * 
 * 
 */



public class Demo01 {
	
	@Test 
	public void test03() {
		test02(10,0);
	}
	
	
	
	
	
	
	public void test02(int a,int b) throws ArithmeticException {
		/*
		 * 拋
		 * 1.開發工程師寫的計算，這個計算會被調用，你要告訴調用者會有計算的問題
		 */
		int i = a/b;
		System.out.println(i);
	}
	
	

	
	@Test
	public void test01() {
		/*
		 * 自動逕行抓異常
		 * 1.是否由使用進行輸入(開發者，軟體使用者)
		 * View的部分，排除輸入不正確的內容
		 */
		
		int c = 0;
		try {
			if(!(c==0)) {
				int a = 10/c;
				System.out.println(a);
			}
			else {
				System.out.println("請勿給0");
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
