package tw.com.lccnet.code;

import java.util.Comparator;
import java.util.function.Consumer;

import javax.swing.text.AbstractDocument.Content;

import org.junit.Test;

import tw.com.lccnet.code.info.MyFun;

/*
 * 
 * 
 */
public class Demo02 {
	
	@Test
	public void test04() {
		//1:33
	}
	public Integer opration(Integer num, MyFun mf) {
		return mf.getVInteger(num)
	}
	
	
	@Test
	public void test03() {
		Comparator<Integer> con = (x,y)->{
			System.out.println("true");
			return 10;
			
		};
		con.compare(10, 20);
	}
	
	@Test
	public void test02() {
		Consumer<String> con =(x)->System.out.println(x);
		con.accept("hahaah");
		
	}
	
	
	
	@Test
	public void test01() {
		
		
		//lamdba
		Runnable r1=()->System.out.println("------------00000---00");
		r1.run();
		
		System.out.println("-------------下方是實作--------------");
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("-----------run-------------");
				// TODO Auto-generated method stub
				
			}
		};
		r.run();
	}
	
	
	
}
