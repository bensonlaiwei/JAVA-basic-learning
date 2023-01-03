package tw.com.code.model4;



/*
 * 同package，不同class
 */


/*
 * private(私有化):只是適用於同套件，同class才可以進行封裝
 * public(公開):整個專案都可以呼叫設值
 * default(適用於同套件，不同class)
 * protected:適用於繼承結構下使用，禁止繼承下不同package無法使用
 */

public class Bean {
	private int id;
	protected String name;
	String email;
	public int age;
	
	public void method() {
		Bean b1 = new Bean();
		
		System.out.println(b1.id);//private
		System.out.println(b1.name);//protected
		System.out.println(b1.email);//Default
		System.out.println(b1.age);//public
	}
}
