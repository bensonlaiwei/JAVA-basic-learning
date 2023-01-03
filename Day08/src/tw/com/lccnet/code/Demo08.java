package tw.com.lccnet.code;

import org.junit.Test;

public class Demo08 {

	@Test
	public void test()
	{
		method(1,2,3,4,6,5);
	}
	public void method(int ... c)
	{
		int total = 0;
		for (int i = 0;i<c.length;i++)
		{
			total+=c[i];
		}
		System.out.println(total);
	}
	
}	
