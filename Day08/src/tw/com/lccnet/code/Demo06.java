package tw.com.lccnet.code;

import org.junit.Test;

public class Demo06 {
	@Test
	public void test01() {
		int f[] = method02();
		int total = 0;
		for(int t = 0; t<f.length ; t++)
		{
			total += f[t];
		}
		System.out.println(total);
	}
	
	
	public int[] method02()
	{
		int[] x = {10,2,5,59,3,123,5,7};
		return x;
	}
	
	
	@Test
	public void test()
	{
		int c = method01();
		System.out.println(c);
	}
	
	public int method01() {
		int a = 10;
		int b = 20;
		int c = 30;
		return a;
	}

}
