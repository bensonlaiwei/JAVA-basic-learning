package tw.com.code.model2;

import org.junit.Test;

/*
 * 屬性:同套件、同類別
 * 
 * 2小25分
 */


public class Demo01 {
	private int id = 10; //私有
	protected String name = "TOm"; //保護
	String email = "123@fojejtw;.com"; //預設
	public String note="haha"; // 公開
	
	@Test
	public void method() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(note);
	}
	
	@Test
	public void method01() {
		Demo01 d1 = new Demo01();
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d1.email);
		System.out.println(d1.note);
	}
	
}
