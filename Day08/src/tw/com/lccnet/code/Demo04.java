package tw.com.lccnet.code;

import org.junit.Test;

public class Demo04 {
	@Test
	public void test01()
	{
		test02(19);
		test03(10,15);
	}
	public void test02(int a)
	{
		if(a>10)
		{
			System.out.println("大於10:"+a);
			
		}
		else {
			System.out.println("小於10:"+a);
		}
		
	}
	public void test03(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a+"大於"+b);
			
		}
		else {
			System.out.println(a+"小於"+b);
		}
		
	}
}
