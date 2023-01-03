package tw.com.code.model;

import org.junit.Test;

/*
 * 繼承
 * 
 */

public class Demo01 {
	
	//子類別呼叫父類別方法
	@Test
	public void test01() {
		
		//子類別可以呼叫父類別方法
		Student st = new Student();
		//印出父類別方法
		st.eat();
		//印出父類別方法
		st.sleep();
		//印出子類別方法
		st.read();
		
		Worker wo = new Worker();
		
		wo.eat();
		wo.sleep();
		wo.work();
		
		
		
	}
	
	//複寫父類別方法
	@Test
	public void test02() {
		Student st = new Student();
		//印出子類別方法
		st.eat();
		//印出子類別方法
		st.sleep();
		st.read();
		
		
		Worker wo = new Worker();
		//印出子類別方法
		wo.eat();
		//印出子類別方法
		wo.sleep();
		wo.work();
		
	}
	
}
