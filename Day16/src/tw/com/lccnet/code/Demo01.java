package tw.com.lccnet.code;

import org.junit.Test;

public class Demo01 {
	
	@Test
	public void test04() {
		Person p = new Person();
		p.setId(1);
		p.setName("Tom");
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Tom");
		
		
		
		Integer u = p.getId();
		Integer o = p1.getId();
		System.out.println(u.equals(o));
	}
	
	
	
	
	
	
	
	
	
	public void test03() {
		Person p = new Person();
		Person p1 = p;
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}
	
	
	@Test
	public void test02() {
		Person p = new Person();
		Person p1 = new Person();
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}
	
	
	
//	@Test
	public void test01() {
		String str1 = "AA";
		String str2 = "BB";
		String str3 = new String("AA");
		String str4 = new String("AA");
		System.out.println("========================");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println("========================");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println("========================");
		System.out.println(str1.hashCode());//取得記憶體位置
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println("========================");
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}
}
