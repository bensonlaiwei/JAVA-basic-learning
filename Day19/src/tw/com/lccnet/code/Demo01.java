package tw.com.lccnet.code;

import org.junit.Test;

import tw.com.lccnet.code.info.InfoTest01;
import tw.com.lccnet.code.info.InfoTest02;
import tw.com.lccnet.code.info.InfoTest03;

/*
 * 
 * 
 */
public class Demo01 {
	
	
	@Test
	public void test04() {
		InfoTest03 i3=()->{
			//列印多航
			System.out.println("aa");
			return 100;
		};
		int j = i3.run();
		System.out.println(j);
	}
	
	
	
	
	@Test
	public void test03() {
		InfoTest02 i2=(u)->{
			//列印多航
			System.out.println(u);
			System.out.println(u);
			System.out.println(u);
		};
		i2.run(300);
	}
	
	
	
	
	public void test02() {
		String st = new String();//建立實體
		new String();//匿名類別
				
	}
	
	
	@Test
	public void test01() {
		//匿名類別
		new InfoTest01() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run........");
				
			}
		}.run();
		
		System.out.println("----------------------");
		//適用於@FunctionalInterface
		InfoTest01 i1 =()->System.out.println("i1----run-----------");
		i1.run();
		
		System.out.println("==================");
		InfoTest02 i2=(x)->System.out.println("i2----run-----------");
		i2.run(200);
		
	}
}
