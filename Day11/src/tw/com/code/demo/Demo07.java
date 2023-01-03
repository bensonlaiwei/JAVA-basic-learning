package tw.com.code.demo;

import org.junit.Test;

/*
 * 繼承 extends
 * 1. 當專案開始時，整個UI/UX都有規劃，這時使用繼承會較少
 * 2. 當專案一直更新時會一直使用繼承，除非是撰寫新的模組
 * 3.當剛學習程式時，繼承可以讓程式設計師將程式完整化
 * 4. java主推結構(封裝、繼承、多型)
 
 */
public class Demo07 {
	
	
	@Test
	public void test01() {
		Student st = new Student();
		st.eat();
		st.sleep();
		st.read();
		
		Worker wk = new Worker();
		wk.eat();
		wk.sleep();
		wk.read();
		
		//新增class後繼成就不需要撰寫同名方法，就可以使用
		Businessman bs = new Businessman();
		bs.eat();
		bs.sleep();
		
	}

	
}
