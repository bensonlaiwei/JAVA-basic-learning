package tw.com.lccnet.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

/*
 * 集合與泛型
 * 
 */


public class Demo01 {
	
	
	
	@Test
	public void test03() {
		//常用
		List list = new ArrayList();
		list.add(10);
		list.add('a');
		list.add("haha");
		list.add(2.56);
		list.remove(0);


		for(Object obj:list) {
			System.out.println(obj);
		}
		list.clear();
		System.out.println(list.size());//個數
		System.out.println(list.isEmpty());//是否為空
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
//	@Test
	public void test02() {
		//常用
		List list = new ArrayList();
		list.add(10);
		list.add('a');
		list.add("haha");
		list.add(2.56);
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
	}
	
	
	
	
//	@Test
	public void test01() {
		Collection coll = new ArrayList();
		//傳入各種型態
		coll.add(10);
		coll.add('a');
		coll.add("haha");
		coll.add(2.56);
		
		for(Object obj:coll) {
			System.out.println(obj);
		}
		
	}

}
