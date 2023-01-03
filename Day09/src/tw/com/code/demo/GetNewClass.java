package tw.com.code.demo;

import org.junit.Test;

public class GetNewClass {
	
	@Test
	public void test01() {
		
		JavaBean jb =new JavaBean();//建立第一個實體
		jb.setId(1);
		jb.setName("Tom");
		jb.setPassword("12345");
		jb.setEmail("123@gmaoxile");
		jb.setAddress("taipei");
		
		
		
		System.out.println(jb);//javabean沒加上tostring方法 內容會變記憶體位置
		
		System.out.println(jb.getName());
		
		
		System.out.println(jb);//加上後會顯示內容
		
		
		
		
		
		JavaBean jb1 =new JavaBean();//建立第二個實體
		jb1.setId(1);
		jb1.setName("jason");
		jb1.setPassword("12345");
		jb1.setEmail("jason@gmaoxile");
		jb1.setAddress("taipei");
		
		
		
		System.out.println(jb1);//javabean沒加上tostring方法 內容會變記憶體位置
		
		System.out.println(jb1.getName());
		
		
		System.out.println(jb1);//加上後會顯示內容
		
		
	}
}
